
public class prod {
String name;
int id;
public prod(int id, String name) {
	super();
	this.name = name;
	this.id = id;
}
@Override
public String toString() {
	return "seq [name=" + name + ", id=" + id + "]";
}

}
