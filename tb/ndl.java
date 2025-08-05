package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;

/* loaded from: classes7.dex */
public class ndl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DINAMIC_BIZ_TYPE = "tmglive";
    public static final String LIVE_LOGO = "https://img.alicdn.com/imgextra/i1/O1CN0136w6nu1HOAbDsfAxH_!!6000000000747-2-tps-173-46.png";
    public static final String PARAMS_STAR_SYM = "?";
    public static final String PARAMS_WITH = "&";
    public static final String PARAM_POST_SPM = "post_spm";
    public static final String PARAM_SJSD = "sjsd";
    public static final String TAB_DISCOVER = "discover";
    public static final String URL_ERROR_TIPS = "https://gw.alicdn.com/imgextra/i2/O1CN01EyyGSC1kNp4fHSej7_!!6000000004672-2-tps-224-224.png";
    public static final String URL_UN_LOGIN = "https://gw.alicdn.com/imgextra/i1/O1CN01nDFf951kbYxQHwM93_!!6000000004702-2-tps-224-224.png";

    /* renamed from: a  reason: collision with root package name */
    public static String f31369a = "";

    public static boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f3a64c36", new Object[]{str})).booleanValue() : new File("/data/local/tmp/.ovs/", str).exists();
    }
}
