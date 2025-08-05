package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes8.dex */
public class odc implements nzl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2096428844);
        kge.a(904778142);
    }

    @Override // tb.nzl
    public String a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5178ea4", new Object[]{this, str, str2});
        }
        if ("android_share".equals(str) && "newsharecheck".equals(str2)) {
            return "{\"path\":\"2\",\"regexList\":[\"[￥](.*?)[￥]|[()/￥€£₴$₰¢₤¥₳₲₪₵《\\ud83d\\udd11\\ud83d\\udddd\\ud83d\\ude3a\\ud83d\\ude38\\ud83c\\udf81\\ud83d\\udcf2\\ud83d\\udcb0\\ud83d\\udcb2\\u2714\\ud83c\\udfb5\\ud83d\\udd10][A-Za-z0-9]{7,15}[()/￥€£₴$₰¢₤¥₳₲₪₵《\\ud83d\\udd11\\ud83d\\udddd\\ud83d\\ude3a\\ud83d\\ude38\\ud83c\\udf81\\ud83d\\udcf2\\ud83d\\udcb0\\ud83d\\udcb2\\u2714\\ud83c\\udfb5\\ud83d\\udd10]\"]}";
        }
        return null;
    }
}
