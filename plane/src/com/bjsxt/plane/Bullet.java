package com.bjsxt.plane;

/**
 * 子弹类:是飞行物
 */
public class Bullet extends FlyingObject {

	
	/** 初始化数据 */
	public Bullet(int x,int y){
		this.x = x;
		this.y = y;
		this.image = ShootGame.bullet;
	}

	/** 移动 */
	@Override
	public void step(){   
		y -= super.speed;
	}

	/** 越界处理 */
	@Override
	public boolean outOfBounds() {
		return y<-height;
	}



}
