package ppti.oop.ds;

import java.util.Comparator;

public class BST<E> {
	private Node<E> root;
	public Comparator<E> comp;
	
	public BST(Comparator<E> comp) {
		root = null;
		this.comp = comp;
	}
	
	private Node<E> push(Node<E> node, E data) {
		if(node == null) {
			return new Node<E>(data);
		} else {
			if(comp.compare(data, node.data) < 0) {
				node.left = push(node.left, data);
			} else if(comp.compare(data, node.data) > 0){
				node.right = push(node.right, data);
			}
			return node;
		}
	}
	
	public void push(E data) {
		root = push(root, data);
	}
	
	private void view(Node<E> node) {
		if(node != null) {
			view(node.left);
			System.out.println(node.data);
			view(node.right);
		}
	}
	
	public void view() {
		view(root);
	}
}
