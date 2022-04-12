package main;

import java.util.Scanner;

import model.SearchBinaryTree;
import model.SearchBinaryTree_Node;

public class Main {
	static SearchBinaryTree<Integer> treeB = new SearchBinaryTree<Integer>();

	static Scanner sc;

	public Main() {

		sc = new Scanner(System.in);

	}

	public static void main(String[] args) {


		Main pc = new Main();

		int option = 0;
		do {

			option = pc.showMenu();
			pc.executeOperation(option);
		} while (option != 0);

	}

	public static int showMenu() {

		System.out.println("*** MENU ***\n" + "(1) Crear arbol\n" + "(2) Agregar hijo\n" + "(3) Eliminar hijos\n"
				+ "(4) Imprimir arbol\n" + "(5) Buscar\n" + "(0) Exit");

		int option = sc.nextInt();
		sc.nextLine();
		return option;

	}

	public static void executeOperation(int option) {
		switch (option) {
		case 0:
			System.out.println("Thanks for use this app, see you.");
			break;
		case 1:
			createTree();
			break;
		case 2:
			insertHijo();
			break;
		case 3:
			deleteHijo();
			break;

		case 4:
			treeB.toString();
			break;

		case 5:
			search();
			break;

		}
	}

	public static void createTree() {
		for (int i = 1; i < 15; i++) {
			try {
				treeB.CreateTree(new SearchBinaryTree_Node<Integer>(), i);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void search() {
		int var = sc.nextInt();
		sc.nextLine();
		treeB.search(treeB.getRoot(), var);
	}

	public static void insertHijo() {
		int var=sc.nextInt();
		sc.nextLine();
		treeB.insertNode(var);
	}

	public static void deleteHijo() {
		int var = sc.nextInt();
		sc.nextLine();
		treeB.delete(new SearchBinaryTree_Node<Integer>(var));
	}

}
