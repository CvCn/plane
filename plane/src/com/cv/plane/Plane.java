package com.cv.plane;

import java.awt.Frame;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class Plane
{
	public static void main(String[] args) {
		JDialog dialog = new JDialog((Frame)null, "plane");
		ShootGame game = new ShootGame(); 
		dialog.add(game); 
		dialog.setVisible(true); // 窗口显示
		dialog.setSize(ShootGame.WIDTH, ShootGame.HEIGHT); // 设置大小
		dialog.setResizable(false);//大小固定
		dialog.setAlwaysOnTop(true); // 设置其总在最上
		dialog.setLocationRelativeTo(null); // 设置窗体初始位置
		dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		game.action(); // 启动执行
	}
}
