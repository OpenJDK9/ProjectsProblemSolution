import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class MainCI {
    ArrayList<String> AllBankList;
    ArrayList<String> Top10BankList;
    ArrayList<String> Top10BankPush;
    ArrayList<String> HeaderBankList;
    ArrayList<String> FooterBankList;
    MainCI()
    {
        AllBankList=new ArrayList<String>();
        Top10BankList=new ArrayList<String>();
        Top10BankPush=new ArrayList<String>();
        HeaderBankList=new ArrayList<String>();
        FooterBankList=new ArrayList<String>();

    }

    public static void main(String ...A)
    {
       MainCI mainCI=new MainCI();
        mainCI.AllBank();
        mainCI.Top10Bank();
        mainCI.Header6Bank();
        mainCI.FooterBank();

    }

    private void AllBank()
    {
        System.out.println("======================AllBank=======================");
        AllBankList.add("SBI");
        AllBankList.add("RBL");
        AllBankList.add("KOTAK");
        AllBankList.add("BOI");
        AllBankList.add("ICICI");
        AllBankList.add("HDFC");
        AllBankList.add("IDBI");
        AllBankList.add("IDFC");
        AllBankList.add("VIJIYA");
        AllBankList.add("PAYTM");
        AllBankList.add("OBC");
        AllBankList.add("ALLAHABADBANK");
        AllBankList.add("BOB");
        AllBankList.add("Bank1");
        AllBankList.add("Bank2");
        AllBankList.add("Bank3");
        AllBankList.add("Bank4");
        AllBankList.add("Bank5");
        AllBankList.add("Bank6");
        AllBankList.add("Bank7");
        AllBankList.add("Bank8");
        AllBankList.add("Bank9");
        AllBankList.add("Bank10");
        AllBankList.add("Bank11");
        AllBankList.add("Bank12");
        System.out.println(Arrays.deepToString(AllBankList.toArray()));

    }

    private  void Top10Bank()
    { System.out.println("======================Top10Bank=======================");

        Top10BankList.add("SBI");
        Top10BankList.add("RBL");
        Top10BankList.add("KOTAK");
        Top10BankList.add("BOI");
        Top10BankList.add("ICICI");
        Top10BankList.add("HDFC");
        Top10BankList.add("IDBI");
        Top10BankList.add("IDFC");
        Top10BankList.add("OBC");
        Top10BankList.add("BOB");
        Top10BankPush=(ArrayList<String>)AllBankList.clone();
        Top10BankPush.retainAll(Top10BankList);
        System.out.println(Arrays.deepToString(Top10BankPush.toArray()));
    }

    private  void Header6Bank()
    {
        System.out.println("======================Header6Bank=======================");
        if(Top10BankPush.size()==1)
        { for (int i=0;i<1;i++)
            { HeaderBankList.add(i,Top10BankPush.get(i)); }
        }
        else if (Top10BankPush.size()==2)
        { for (int i=0;i<2;i++)
        { HeaderBankList.add(i,Top10BankPush.get(i)); }
        }
        else if (Top10BankPush.size()==3)
        { for (int i=0;i<3;i++)
        { HeaderBankList.add(i,Top10BankPush.get(i)); }
        }
        else if (Top10BankPush.size()==4)
        { for (int i=0;i<4;i++)
        { HeaderBankList.add(i,Top10BankPush.get(i)); }
        }
        else if (Top10BankPush.size()==5)
        { for (int i=0;i<5;i++)
        { HeaderBankList.add(i,Top10BankPush.get(i));
        }
        }
        else
            { for (int i=0;i<6;i++)
            {
                HeaderBankList.add(i,Top10BankPush.get(i));
            }
            }

        System.out.println(Arrays.deepToString(HeaderBankList.toArray()));

    }


    private void FooterBank()
    {
        System.out.println("======================FooterBank=======================");
        AllBankList.removeAll(Top10BankList);
        System.out.println(Arrays.deepToString(AllBankList.toArray()));
    }
}
