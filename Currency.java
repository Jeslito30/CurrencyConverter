package currency;


import javax.swing.*;
public class Currency {
    
    public void currencyConversion(String c1, String c2, JTextField currentCurrency, JTextField convertCurrency){
        switch (c1) {
            case "USD":
                if(c2.equals("PHP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 58.12863;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("KWD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.30663524;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("BHD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.376;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("OMR")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.38496353;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("JOD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.709;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("GIP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.77211499;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("GBP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.77211499;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("KYD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.82111055;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("EUR")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.9282475;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("USD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1;
                    convertCurrency.setText(String.valueOf(result));
                }
                break;
                case "EUR":
                if(c2.equals("PHP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 62.627815;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("KWD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.33034894 ;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("BHD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.40505678;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("OMR")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.41471957;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("JOD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.76379058;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("GIP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.83169344;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("GBP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.83169344;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("KYD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.88459213;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("EUR")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1;
                    convertCurrency.setText(String.valueOf(result));
                    
                }else if(c2.equals("USD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1.0772167;
                    convertCurrency.setText(String.valueOf(result));
                }
                break;

                case "KYD":
                if(c2.equals("PHP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 70.7712;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("KWD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.37337178 ;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("BHD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.45788176;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("OMR")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.46898865;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("JOD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.86383433;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("GIP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.94070851;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("GBP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.94070851;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("KYD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("EUR")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1.1293943;
                    convertCurrency.setText(String.valueOf(result));
                    
                }else if(c2.equals("USD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1.2171172;
                    convertCurrency.setText(String.valueOf(result));
                }
                break;
            
                case "GBP":
                if(c2.equals("PHP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 75.318144;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("KWD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.39714159 ;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("BHD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.48694686;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("OMR")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.49857313;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("JOD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.91820564;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("GIP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1.00;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("GBP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1.00;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("KYD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1.0622999;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("EUR")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1.2015917;
                    convertCurrency.setText(String.valueOf(result));
                    
                }else if(c2.equals("USD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1.2948892;
                    convertCurrency.setText(String.valueOf(result));
                }
                break;

                case "GIP":
                if(c2.equals("PHP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 75.304799;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("KWD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.39706144 ;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("BHD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.48689713;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("OMR")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.49847934;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("JOD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.91820564;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("GIP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1.00;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("GBP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1.00;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("KYD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1.0622999;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("EUR")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1.2015917;
                    convertCurrency.setText(String.valueOf(result));
                    
                }else if(c2.equals("USD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1.2948892;
                    convertCurrency.setText(String.valueOf(result));
                }
                break;

                case "JOD":
                if(c2.equals("PHP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 82.01416;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("KWD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.43248276 ;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("BHD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.5303244;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("OMR")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.54295224;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("JOD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("GIP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1.0892248;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("GBP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1.0890505;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("KYD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1.1573192;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("EUR")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1.3085034;
                    convertCurrency.setText(String.valueOf(result));
                    
                }else if(c2.equals("USD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1.4104372;
                    convertCurrency.setText(String.valueOf(result));
                }
                break;

                case "OMR":
                if(c2.equals("PHP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 151.02155;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("KWD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.79658431 ;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("BHD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.97680835 ;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("OMR")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("JOD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1.8417939;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("GIP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 2.0051683;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("GBP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 2.0051683;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("KYD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 2.1354459;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("EUR")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 2.4098803;
                    convertCurrency.setText(String.valueOf(result));
                    
                }else if(c2.equals("USD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 2.5976754;
                    convertCurrency.setText(String.valueOf(result));
                }
                break;

                case "BHD":
                if(c2.equals("PHP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 154.61289;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("KWD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.81550249 ;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("BHD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1 ;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("OMR")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1.0238333;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("JOD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1.8856383;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("GIP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 2.0529148;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("GBP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 2.0529148;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("KYD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 2.1860502;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("EUR")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 2.4672947;
                    convertCurrency.setText(String.valueOf(result));
                    
                }else if(c2.equals("USD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 2.6595745;
                    convertCurrency.setText(String.valueOf(result));
                }
                break;

                case "KWD":
                if(c2.equals("PHP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 189.60912;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("KWD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1 ;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("BHD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1.2262683 ;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("OMR")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1.2554728;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("JOD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 2.3122985;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("GIP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 2.5169493;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("GBP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 2.5169493;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("KYD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 2.6808712;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("EUR")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 3.0252645;
                    convertCurrency.setText(String.valueOf(result));
                    
                }else if(c2.equals("USD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 3.2612112;
                    convertCurrency.setText(String.valueOf(result));
                }
                break;

                case "PHP":
                if(c2.equals("PHP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 1;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("KWD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.0052727413 ;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("BHD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.0064658041 ;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("OMR")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.0066197066;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("JOD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.012192168;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("GIP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.013274942;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("GBP")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.013274942;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("KYD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.014110115;
                    convertCurrency.setText(String.valueOf(result));

                }else if(c2.equals("EUR")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.015956961;
                    convertCurrency.setText(String.valueOf(result));
                    
                }else if(c2.equals("USD")){
                    double amount = Double.parseDouble(currentCurrency.getText());
                    double result = amount * 0.017198425;
                    convertCurrency.setText(String.valueOf(result));
                }
                break;

            
        
            
        }
    }
            
}
