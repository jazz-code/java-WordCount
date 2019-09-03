package wordcount;

public class Words
{
    private String unText;

    public Words(String unText)
    {
        this.unText = unText;
    }

    public String getUnText()
    {
        return unText;
    }

    public void setUnText(String unText)
    {
        this.unText = unText;
    }

    @Override
    public String toString()
    {
        return unText;
    }
}