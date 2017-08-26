class singleton {
	private static singleton obj = null;

	public static singleton getobj() {

		if (obj == null) {
			synchronized (obj) {
				if (obj == null) {
					obj = new singleton();
				}
			}
		}
		return obj;
	}
}

class SinglePattern {
	public static void mian(String[] args) {
		singleton ob = new singleton();
		singleton ob1 = new singleton();
		singleton ob2 = new singleton();
		singleton ob3 = new singleton();

	}
}
