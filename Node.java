package Lab8;

import java.util.ArrayList;

public class Node {
	int value, distance, parent;
	boolean visited;
	ArrayList<Node> adj;
	
	int sTime, eTime;
	
	public Node(int val){
		value = val;
		parent = -1;
		adj = new ArrayList<Node>();
		visited = false;
		distance = Integer.MAX_VALUE;
		sTime = 0;
		eTime = 0;
	}
	
	public int getParent() {
		return parent;
	}
	
	public void setParent(int p) {
		parent = p;
	}
	
	public int getValue() {
		return value;
	} 
	
	public void setValue(int val) {
		value = val;
	}
	
	public void addAdj(Node n){
		adj.add(n);
	}
	
	public ArrayList<Node> getAdj(){
		return adj;
	}
	
	public void setAdj(ArrayList<Node> a){
		adj = a;
	}
	
	public int getDistance() {
		return distance;
	}
	
	public void setDistance(int dis) {
		distance = dis;
	}
	
	public int getStartTime() {
		return sTime;
	}
	
	public int getEndTime() {
		return eTime;
	}
}
