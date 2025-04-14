package com.zoltar.engine_settings.physics;

import java.util.List;

import com.zoltar.entities.Entity;
import com.zoltar.world.Floor;

public class Physics{
	public void gravity(List<Floor> floors, List<Entity> entities){
		for (int i = 0; i < entities.size(); i++) {
			for (int j = 0; j < floors.size(); j++) {
				boolean isOnFall = true;
				boolean isOnFloor = false;
				
				int entityStep = entities.get(i).getY();
				int entityNextStep = entities.get(i).getY() + entities.get(i).getSpeed();
				int floorTop = floors.get(j).getY() + floors.get(j).getHeight();
				int floorBot = floors.get(j).getY();
				 
				if(entityNextStep == floorTop){
					isOnFall = false;
					isOnFloor = true;
				}
				
				if(entityNextStep > floorTop &&
				   entityNextStep < floorBot){
					isOnFall = false;
					isOnFloor = true;
				}
				
				if(entityStep < floorTop &&
				   entityNextStep > floorBot){
					isOnFall = false;
					isOnFloor = true;
				}
				
				entities.get(i).setOnFall(isOnFall);
				entities.get(i).setOnFloor(isOnFloor);
				
				if(isOnFloor){
					entities.get(i).setY(floors.get(j).getY() + floors.get(j).getHeight());
					break;
				}
			}
		}
	}
}
