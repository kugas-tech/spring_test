package bean;

public class Member {

    private String Id;
    private String NickName;
    private String Address;

    public Member(){

    }

    public Member(String Id, String NickName){
        this.Id = Id;
        this.NickName = NickName;
    }

    public String getId(){
        return Id;
    }

    public void SetId(String Id){
        this.Id = Id;
    }

    public String getNickName(){
        return NickName;
    }

    public void setNickName(String NickName){
        this.NickName = NickName;
    }

    public String[] GetInfo(){
        String[] MemberInfo;
        MemberInfo = new String[]{this.Id, this.NickName, this.Address};

        return MemberInfo;
    }
}
