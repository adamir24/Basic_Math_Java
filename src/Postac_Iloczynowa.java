import javax.swing.*;

public class Postac_Iloczynowa {

    public void postacIloczynowa(String aTxt, String bTxt, String cTxt){
        Miejsca_Zerowe_FKwadratowa mz = new Miejsca_Zerowe_FKwadratowa();
        if(mz.Delta(aTxt,bTxt,cTxt)>0)
        {
            if(mz.x1(aTxt,bTxt,mz.Delta(aTxt,bTxt,cTxt))>0 && mz.x2(aTxt,bTxt,mz.Delta(aTxt,bTxt,cTxt))>0)
            {
                JOptionPane.showMessageDialog(null,"y="+aTxt+"(x"
                                +(-mz.x1(aTxt,bTxt,mz.Delta(aTxt,bTxt,cTxt)))+")(x"
                                +(-mz.x2(aTxt,bTxt,mz.Delta(aTxt,bTxt,cTxt)))+")" ,
                        "Postać iloczynowa", JOptionPane.INFORMATION_MESSAGE);
            }
            if(mz.x1(aTxt,bTxt,mz.Delta(aTxt,bTxt,cTxt))<0 && mz.x2(aTxt,bTxt,mz.Delta(aTxt,bTxt,cTxt))<0)
            {
                JOptionPane.showMessageDialog(null,"y="+aTxt+"(x+"
                                +(-mz.x1(aTxt,bTxt,mz.Delta(aTxt,bTxt,cTxt)))+")(x+"
                                +(-mz.x2(aTxt,bTxt,mz.Delta(aTxt,bTxt,cTxt)))+")" ,
                        "Postać iloczynowa", JOptionPane.INFORMATION_MESSAGE);
            }
            if(mz.x1(aTxt,bTxt,mz.Delta(aTxt,bTxt,cTxt))>0 && mz.x2(aTxt,bTxt,mz.Delta(aTxt,bTxt,cTxt))<0)
            {
                JOptionPane.showMessageDialog(null,"y="+aTxt+"(x"
                                +(-mz.x1(aTxt,bTxt,mz.Delta(aTxt,bTxt,cTxt)))+")(x+"
                                +(-mz.x2(aTxt,bTxt,mz.Delta(aTxt,bTxt,cTxt)))+")" ,
                        "Postać iloczynowa", JOptionPane.INFORMATION_MESSAGE);
            }
            if(mz.x1(aTxt,bTxt,mz.Delta(aTxt,bTxt,cTxt))<0 && mz.x2(aTxt,bTxt,mz.Delta(aTxt,bTxt,cTxt))>0)
            {
                JOptionPane.showMessageDialog(null,"y="+aTxt+"(x+"
                                +(-mz.x1(aTxt,bTxt,mz.Delta(aTxt,bTxt,cTxt)))+")(x"
                                +(-mz.x2(aTxt,bTxt,mz.Delta(aTxt,bTxt,cTxt)))+")" ,
                        "Postać iloczynowa", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if(mz.Delta(aTxt,bTxt,cTxt)==0)
        {
            if(mz.x0(aTxt,bTxt)>0)
            {
                JOptionPane.showMessageDialog(null, "y=" + aTxt + "(x" + (-mz.x0(aTxt, bTxt)) + ")\u00B2","Postać iloczynowa",JOptionPane.INFORMATION_MESSAGE);
            }
            if(mz.x0(aTxt,bTxt)<0)
            {
                JOptionPane.showMessageDialog(null, "y=" + aTxt + "(x+" + (-mz.x0(aTxt, bTxt)) + ")\u00B2","Postać iloczynowa",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if(mz.Delta(aTxt,bTxt,cTxt)<0)
        {
            JOptionPane.showMessageDialog(null, "Nie istnieje postać iloczynowa dla podanych parametrów", "Postać iloczynowa",JOptionPane.ERROR_MESSAGE);
        }
    }

}
