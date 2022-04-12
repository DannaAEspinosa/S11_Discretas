package model;

public class SearchBinaryTree<T> {
	SearchBinaryTree_Node<T> root;

	public boolean isEmpty() {
		if (root == null) {
			return true;
		}
		return false;
	}

	public void ShowEmpty(SearchBinaryTree_Node<T> root) {
		if (root == null) {
			System.out.println("This tree is empty..");
		}
		System.out.println(root.getData());
	}

	public SearchBinaryTree_Node<T> getRoot() {
		if (root == null) {
			root = new SearchBinaryTree_Node<T>();
		}
		return root;
	}

	public SearchBinaryTree() {
		this.root = null;
	}

	// Crea un árbol binario.
	public void CreateTree(SearchBinaryTree_Node<T> node, T data) {
		if (root == null) {
			root = new SearchBinaryTree_Node<T>();
		} else {
			if (Math.random() > 0.5) {
				if (node.leftChild == null) {
					node.leftChild = new SearchBinaryTree_Node<T>(data);
				} else {
					CreateTree(node.leftChild, data);
				}
			} else {
				if (node.rightChild == null) {
					node.rightChild = new SearchBinaryTree_Node<T>(data);
				} else {
					CreateTree(node.rightChild, data);
				}
			}
		}
	}

	/*
	 * Buscar
	 */
	public SearchBinaryTree_Node<T> search(SearchBinaryTree_Node<T> root, T data) {
		SearchBinaryTree_Node<T> current = root;
		while ((root != null) && (current.getData() != (int) data)) {
			if ((int) data < current.getData()) {
				current = search(current.leftChild, data);
			} else {
				current = search(current.rightChild, data);
			}
			return current;
		}
		return current;
	}

	//agregar
	public SearchBinaryTree_Node<T> insertNode(T data) {
		SearchBinaryTree_Node<T> p = root;
		SearchBinaryTree_Node<T> pre = null;
		while (p != null) {
			pre = p;
			if (p.getData() < (int) data) {
				p = p.rightChild;
			} else {
				p = p.leftChild;
			}
		}
		if (root == null) {
			root = new SearchBinaryTree_Node<T>(data);

		} else if (pre.getData() < (int) data) {
			pre.rightChild = new SearchBinaryTree_Node<T>(data);
		} else {
			pre.leftChild = new SearchBinaryTree_Node<T>(data);
		}
		return pre;
	}

	// Eliminar
	public void delete(SearchBinaryTree_Node<T> node) {
		SearchBinaryTree_Node<T> aux = node;
		if (node != null) {

			if (node.rightChild != null) {
				node = node.leftChild;
			} else if (node.leftChild == null) {
				node = node.rightChild;
			} else {
				aux = node.leftChild;
				while (aux.rightChild != null) {
					aux = aux.rightChild;
				}
				aux.rightChild = node.rightChild;
				aux = node;
				node = node.leftChild;
			}
			aux = null;
		}
	}
	
	
}
