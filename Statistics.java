public class Statistics {
    double maxNr;
    double minNr;
    double meanNr;
    double median;
    double standDev;
    
    double getMax() {
        return maxNr;
    }

    void setMax(double a[]) {
        maxNr = a[0];
        for (int i = 0; i < a.length; i++) {
            if (maxNr < a[i]) {
                maxNr = a[i];
            }
        }

        
    }
    double getMin() {
        return minNr;
    }
    void setMin(double a[]) {
         minNr = a[0];
        for (int i = 0; i < a.length; i++) {
            if (minNr > a[i]) {
                minNr = a[i];
            }
        }

        
    }

    double getMedian() {
        return median;
    }

    void setMedian(double a[]) {
        median = 0;
        
        if ((a.length%2) == 1) {
                 median = a[((a.length+1)/2)-1];  
                     
        } else {
            median = (a[a.length/2-1]+a[a.length/2])/2;
        }


    }
    double getAverage() {
        return meanNr;
    }
    void setAverage(double a[]) {

        meanNr = 0;
        for (int i = 0; i < a.length; i++) {

            meanNr = (a[i] + meanNr);
        }

        meanNr = (meanNr/a.length);



    }

    double getStdev () {
        return standDev;
    }
    void  setStdev(double a[]) {
        standDev = 0;
        double sum = 0, mean = 0, temp = 0;
      
        mean = meanNr;
       
        for (int i = 0; i < a.length; i++) {
     
            sum =  sum + Math.pow((a[i]-mean),2);

        }
        
        mean = sum / (a.length);

        standDev = Math.sqrt(mean);

        
    }
}
