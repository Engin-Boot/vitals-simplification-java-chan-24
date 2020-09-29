package vitals;

public class VitalsCheck {
	private IReporter reporter = new vitalReportImplementer();
	
	public boolean areVitalsOk(int bpm, int spo2, int respRate) {
	    boolean BP =  isBpOk(bpm);
	    boolean Spo2 = isSpo2Ok(spo2);
	    boolean RespRate = isRespRateOk(respRate);

	    return BP && Spo2 && RespRate;
	 }
	
	private boolean isBpOk(int bpm) {
        if(bpm<70) {
            reporter.alert("BP", "Too Low");
            return false;
        }
        else if(bpm > 150) {
            reporter.alert("BP", "Too High");
            return false;
        } 
        reporter.alert("BP", "Normal");
        return true;    
    }
	private boolean isSpo2Ok(int spo2) {
	    if(spo2<90) {
	        reporter.alert("spo2", "low");
	        return false;
	    } 
	    reporter.alert("spo2", "Normal");
	    return true;    
	}
	private boolean isRespRateOk(int respRate) {
	    if(respRate<30){
	    	reporter.alert("RespRate", "low");
	        return false;
	    }
	    else if(respRate > 95) {
	    	reporter.alert("RespRate", "High");
	        return false;
	    } 
	    reporter.alert("RespRate", "Normal");
	    return true;    
	}

}
