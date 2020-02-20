package homework_18;

public class MyEntry<K,V> {
	protected K kind;
	protected V version;
	
	public MyEntry(K kind,V type){
		this.kind=kind;
		this.version=type;
	}
	
	public K getKind() {
		return kind;
	}
	public void setKind(K kind) {
		this.kind = kind;
	}
	public V getType() {
		return version;
	}
	public void setType(V type) {
		this.version = type;
	}

	@Override
	public String toString() {
		return "MyEntry [kind=" + kind + ", type=" + version + "]";
	}
	
	
	
}
