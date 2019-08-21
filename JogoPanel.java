package jogo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class JogoPanel extends JPanel implements MouseListener{
	public JogoPanel() {
		super();
		addMouseListener(this);
	}
	
	public void paintComponent(Graphics g) {
		

		super.paintComponent(g);
		
		g.drawRect(0, 0, 600, 600);
		
		g.drawLine(200, 0, 200, 600);
		g.drawLine(400, 0, 400, 600);
		
		g.drawLine(0, 200, 600, 200);
		g.drawLine(0, 400, 600, 400);
		
	}
	boolean ganhouX = false;
	boolean ganhouO = false;
	boolean executa = true;
	int cliquesNoMouse = 1;
	int quadranteEmQueVaiDesenhar = 0;
	boolean D1=false;;boolean D2=false;;boolean D3=false;boolean D4=false;;boolean D5=false;;boolean D6=false;;boolean D7=false;;boolean D8=false;;boolean D9=false;
	int cont = 0;
	boolean Q1X=false;;boolean Q2X=false;;boolean Q3X=false;;boolean Q4X=false;;boolean Q5X=false;;boolean Q6X=false;;boolean Q7X=false;;boolean Q8X=false;;boolean Q9X=false;
	boolean Q1O=false;;boolean Q2O=false;;boolean Q3O=false;;boolean Q4O=false;;boolean Q5O=false;;boolean Q6O=false;;boolean Q7O=false;;boolean Q8O=false;;boolean Q9O=false;
	
	
	@Override
	public void mouseClicked(MouseEvent e) {
		Graphics g = getGraphics();//GLORIAAAAAAAAAAAAAA
		boolean desenhaX = false;
		boolean desenhaBolinha = false;
		
		cliquesNoMouse += 1;
		if(cliquesNoMouse % 2 == 0) {
			desenhaX = true;
		}else {
			desenhaBolinha = true;
		}
		
		while(executa) {
			if(e.getY() <= 200) {
				if(e.getX() <= 200) {
					quadranteEmQueVaiDesenhar = 1;
				}else if(e.getX() <= 400) {
					quadranteEmQueVaiDesenhar = 2;
				}else {
					quadranteEmQueVaiDesenhar = 3;
				}
			}else if(e.getY() <= 400){
				if(e.getX() <= 200) {
					quadranteEmQueVaiDesenhar = 4;
				}else if(e.getX() <= 400) {
					quadranteEmQueVaiDesenhar = 5;
				}else {
					quadranteEmQueVaiDesenhar = 6;
				}
			}else {
				if(e.getX() <= 200) {
					quadranteEmQueVaiDesenhar = 7;
				}else if(e.getX() <= 400) {
					quadranteEmQueVaiDesenhar = 8;
				}else {
					quadranteEmQueVaiDesenhar = 9;
				}
			}
			
			switch(quadranteEmQueVaiDesenhar){
				case 1:
					if(!D1) {
						cont += 1;
						if(desenhaX == true) {
							g.setColor(Color.RED);
							g.drawLine(0, 0, 200, 200);
							g.drawLine(200, 0, 0, 200);
							Q1X = true;
						}else if(desenhaBolinha == true) {
							g.setColor(Color.BLUE);
							g.drawOval(5, 5, 190, 190);
							Q1O = true;
						}
						D1 = true;
					}
					break;
				case 2:
					if(!D2) {
						cont += 1;
						if(desenhaX == true) {
							g.setColor(Color.RED);
							g.drawLine(200, 0, 400, 200);
							g.drawLine(400, 0, 200, 200);
							Q2X = true;
						}else if(desenhaBolinha == true) {
							g.setColor(Color.BLUE);
							g.drawOval(205, 5, 190, 190);
							Q2O = true;
						}
						D2 = true;
					}
					
					break;
				case 3:
					if(!D3) {
						cont += 1;
						if(desenhaX == true) {
							g.setColor(Color.RED);
							g.drawLine(400, 0, 600, 200);
							g.drawLine(600, 0, 400, 200);
							Q3X = true;
						}else if(desenhaBolinha == true) {
							g.setColor(Color.BLUE);
							g.drawOval(405, 5, 190, 190);
							Q3O = true;
						}
						D3 = true;
					}
					
					break;
				case 4:
					if(!D4) {
						cont += 1;
						if(desenhaX == true) {
							g.setColor(Color.RED);
							g.drawLine(0, 200, 200, 400);
							g.drawLine(200, 200, 0, 400);
							Q4X = true;
						}else if(desenhaBolinha == true) {
							g.setColor(Color.BLUE);
							g.drawOval(5, 205, 190, 190);
							Q4O = true;
						}
						D4 = true;
					}
					break;
				case 5:
					if(!D5) {
						cont += 1;
						if(desenhaX == true) {
							g.setColor(Color.RED);
							g.drawLine(200, 200, 400, 400);
							g.drawLine(400, 200, 200, 400);
							Q5X = true;
						}else if(desenhaBolinha == true) {
							g.setColor(Color.BLUE);
							g.drawOval(205, 205, 190, 190);
							Q5O = true;
						}
						D5 = true;
					}
					break;
				case 6:
					if(!D6) {
						cont += 1;
						if(desenhaX == true) {
							g.setColor(Color.RED);
							g.drawLine(400, 200, 600, 400);
							g.drawLine(600, 200, 400, 400);
							Q6X = true;
						}else if(desenhaBolinha == true) {
							g.setColor(Color.BLUE);
							g.drawOval(405, 205, 190, 190);
							Q6O = true;
						}
						D6 = true;
					}
					break;
				case 7:
					if(!D7) {
						cont += 1;
						if(desenhaX == true) {
							g.setColor(Color.RED);
							g.drawLine(0, 400, 200, 600);
							g.drawLine(200, 400, 0, 600);
							Q7X = true;
						}else if(desenhaBolinha == true) {
							g.setColor(Color.BLUE);
							g.drawOval(5, 405, 190, 190);
							Q7O = true;
						}
						D7 = true;
					}
					break;
				case 8:
					if(!D8) {
						cont += 1;
						if(desenhaX == true) {
							g.setColor(Color.RED);
							g.drawLine(200, 400, 400, 600);
							g.drawLine(400, 400, 200, 600);
							Q8X = true;
						}else if(desenhaBolinha == true) {
							g.setColor(Color.BLUE);
							g.drawOval(205, 405, 190, 190);
							Q8O = true;
						}
						D8 = true;
					}
					break;
				case 9:
					if(!D9) {
						cont += 1;
						if(desenhaX == true) {
							g.setColor(Color.RED);
							g.drawLine(400, 400, 600, 600);
							g.drawLine(600, 400, 400, 600);
							Q9X = true;
						}else if(desenhaBolinha == true) {
							g.setColor(Color.BLUE);
							g.drawOval(405, 405, 190, 190);
							Q9O = true;
						}
						D9 = true;
					}
					break;
			}
			if(Q1X==true&&Q2X==true&&Q3X==true) {
				ganhouX = true;
			}if(Q1X==true && Q4X==true && Q7X==true) {
				ganhouX = true;
			}if(Q1X == true && Q5X == true && Q9X == true) {
				ganhouX = true;
			}if(Q2X == true && Q5X == true && Q8X == true) {
				ganhouX = true;
			}if(Q3X == true && Q6X == true && Q9X == true) {
				ganhouX = true;
			}if(Q3X == true && Q5X == true && Q7X == true) {
				ganhouX = true;
			}if(Q4X == true && Q5X == true && Q6X == true) {
				ganhouX = true;
			}if(Q7X == true && Q8X == true && Q9X == true) {
				ganhouX = true;
			}
			///////////////////////////////////////////////////
			if(Q1O==true&&Q2O==true&&Q3O==true) {
				ganhouO = true;
			}if(Q1O==true && Q4O==true && Q7O==true) {
				ganhouO = true;
			}if(Q1O == true && Q5O == true && Q9O == true) {
				ganhouO = true;
			}if(Q2O == true && Q5O == true && Q8O == true) {
				ganhouO = true;
			}if(Q3O == true && Q6O == true && Q9O == true) {
				ganhouO = true;
			}if(Q3O == true && Q5O == true && Q7O == true) {
				ganhouO = true;
			}if(Q4O == true && Q5O == true && Q6O == true) {
				ganhouO = true;
			}if(Q7O == true && Q8O == true && Q9O == true) {
				ganhouO = true;
			}
			if(ganhouX == true || ganhouO == true) {
				executa = false;
			}
			Font f = new Font("Serif",Font.BOLD,35);
			g.setFont(f);
			while(ganhouX == true) {
				setBackground(Color.gray);
				g.drawString("X ganhou", 280, 280);
				try {
					Thread.currentThread().sleep(3000);
					System.exit(0);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}while(ganhouO == true) {
				setBackground(Color.gray);
				g.drawString("O ganhou", 280, 280);
				try {
					Thread.currentThread().sleep(3000);
					System.exit(0);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}while(cont == 9) {
				setBackground(Color.gray);
				g.drawString("DEU VELHA :(", 220, 280);
				try {
					Thread.currentThread().sleep(3000);
					System.exit(0);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
			
			break;
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
