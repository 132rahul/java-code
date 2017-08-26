class SinglePattern{  
	 private static SinglePattern instance;
	    
	    private SinglePattern(){}
	    
	    public static synchronized SinglePattern getInstance(){
	        if(instance == null){
	            instance = new SinglePattern();
	        }
	        return instance;
	    }  
}