package com.dennismedeiros.veracode.platform.api.sdk.lang;

public class Pair<K, V> {

	private final K key;
	private final V value;

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getLeft() {
		return key;
	}

	public V getRight() {
		return value;
	}

	@Override
	public int hashCode() {
		return key.hashCode() ^ value.hashCode();
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Pair))
			return false;
		Pair<?, ?> pairo = (Pair<?, ?>) o;
		return this.key.equals(pairo.getLeft()) && this.value.equals(pairo.getRight());
	}

}