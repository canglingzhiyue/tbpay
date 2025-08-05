package com.taobao.message.kit.util;

import com.alibaba.security.wukong.pipe.RiskDataPipeManager;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.ActVideoSetting;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import com.taobao.media.MediaConstant;
import java.util.regex.Pattern;
import tb.kge;
import tb.riy;

/* loaded from: classes7.dex */
public class PatternsUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static Pattern EMAIL = null;
    public static final String EMOJI_REGEX = "[\\uD83C\\uDF00-\\uD83D\\uDDFF]|[\\uD83E\\uDD00-\\uD83E\\uDDFF]|[\\uD83D\\uDE00-\\uD83D\\uDE4F]|[\\uD83D\\uDE80-\\uD83D\\uDEFF]|[\\u2600-\\u26FF]\\uFE0F?|[\\u2700-\\u27BF]\\uFE0F?|\\u24C2\\uFE0F?|[\\uD83C\\uDDE6-\\uD83C\\uDDFF]{1,2}|[\\uD83C\\uDD70\\uD83C\\uDD71\\uD83C\\uDD7E\\uD83C\\uDD7F\\uD83C\\uDD8E\\uD83C\\uDD91-\\uD83C\\uDD9A]\\uFE0F?|[\\u0023\\u002A\\u0030-\\u0039]\\uFE0F?\\u20E3|[\\u2194-\\u2199\\u21A9-\\u21AA]\\uFE0F?|[\\u2B05-\\u2B07\\u2B1B\\u2B1C\\u2B50\\u2B55]\\uFE0F?|[\\u2934\\u2935]\\uFE0F?|[\\u3030\\u303D]\\uFE0F?|[\\u3297\\u3299]\\uFE0F?|[\\uD83C\\uDE01\\uD83C\\uDE02\\uD83C\\uDE1A\\uD83C\\uDE2F\\uD83C\\uDE32-\\uD83C\\uDE3A\\uD83C\\uDE50\\uD83C\\uDE51]\\uFE0F?|[\\u203C\\u2049]\\uFE0F?|[\\u25AA\\u25AB\\u25B6\\u25C0\\u25FB-\\u25FE]\\uFE0F?|[\\u00A9\\u00AE]\\uFE0F?|[\\u2122\\u2139]\\uFE0F?|\\uD83C\\uDC04\\uFE0F?|\\uD83C\\uDCCF\\uFE0F?|[\\u231A\\u231B\\u2328\\u23CF\\u23E9-\\u23F3\\u23F8-\\u23FA]\\uFE0F";
    private static Pattern PHONE;
    private static Pattern WEB_URL;
    private static final String[] domains;

    static {
        kge.a(809850430);
        domains = new String[]{"com", AdvanceSetting.CLEAR_NOTIFICATION, "net", "org", "edu", "gov", "int", "hk", "top", "tel", "biz", "cc", "tv", "info", "name", "mil", "mobi", "asia", "cd", "travel", "pro", "museum", "coop", "aero", "ar", "at", ActVideoSetting.ACT_URL, "be", "br", "ca", "ch", ErrorType.DATA, "dk", RiskDataPipeManager.PIPE_RESULT_ERROR_CODE_KEY, "ee", "eg", "eh", "es", "fi", "fr", "hk", "ie", "in", AdvanceSetting.NETWORK_TYPE, "jp", "kh", "kr", "ky", "lt", "lu", "ma", "mc", MediaConstant.DEFINITION_MD, "mo", "mv", "mx", "nl", "no", "qa", MspGlobalDefine.PA, "pe", PushConstants.URI_PACKAGE_NAME, "pl", AdvertisementOption.PRIORITY_VALID_TIME, "re", "ro", "ru", "rw", "se", "sg", "th", "tr", "tw", "uk", "us", "vn", "za"};
    }

    public static Pattern getWebUrlPattern() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pattern) ipChange.ipc$dispatch("ac8d30af", new Object[0]);
        }
        Pattern pattern = WEB_URL;
        if (pattern != null) {
            return pattern;
        }
        Pattern compile = Pattern.compile("((https?://)?([-a-zA-Z0-9_]+\\.)+((com)|(cn)|(edu)|(org)|(net)|(gov)|(mil)|(int)|(biz)|(cc)|(tv)|(xin))(([/?]([-a-zA-Z0-9_:@&=+,.!/()~%$?#;*]+[a-zA-Z0-9_/~$#*])?)|(\\.[a-zA-Z]+(([/?][-a-zA-Z0-9_:@&=+,.!/()~%$?#;*]+[a-zA-Z0-9_/~$#*])|(:[1-9][0-9]*)([/?][-a-zA-Z0-9_:@&=+,.!/()~%$?#;*]+[a-zA-Z0-9_/~$#*])?)?)|(:[1-9][0-9]*)([/?]([-a-zA-Z0-9_:@&=+,.!/()~%$?#;*]+[a-zA-Z0-9_/~$#*])?)?)?)|(((https?://)|(www\\.))([-a-zA-Z0-9_]+\\.)+[a-zA-Z]+(([/?]([-a-zA-Z0-9_:@&=+,.!/()~%$?#;*]+[a-zA-Z0-9_/~$#*])?)|(:[1-9][0-9]*)([/?]([-a-zA-Z0-9_:@&=+,.!/()~%$?#;*]+[a-zA-Z0-9_/~$#*])?)?)?)|(https?://(([0-1][0-9]?[0-9]?)|(2[0-4][0-9])|(25[0-5])|([2-9][0-9]?))\\.(([0-1][0-9]?[0-9]?)|(2[0-4][0-9])|(25[0-5])|([2-9][0-9]?))\\.(([0-1][0-9]?[0-9]?)|(2[0-4][0-9])|(25[0-5])|([2-9][0-9]?))\\.(([0-1][0-9]?[0-9]?)|(2[0-4][0-9])|(25[0-5])|([2-9][0-9]?))(([/?]([-a-zA-Z0-9_:@&=+,.!/()~%$?#;*]+[a-zA-Z0-9_/~$#*])?)|(:[1-9][0-9]*)([/?]([-a-zA-Z0-9_:@&=+,.!/()~%$?#;*]+[a-zA-Z0-9_/~$#*])?)?)?)");
        WEB_URL = compile;
        return compile;
    }

    public static boolean isPhoneNumer(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a667004", new Object[]{str})).booleanValue();
        }
        if (PHONE == null) {
            PHONE = Pattern.compile("^400[0-9]{7}$|^800[0-9]{7}$|^((\\+86)|(86))?[1][3456789][0-9]{9}$|^(0[0-9]{2,3}[-]?)?\\d{7,8}$");
        }
        return PHONE.matcher(str).matches();
    }

    public static Pattern getEmailPattern() {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (Pattern) ipChange.ipc$dispatch("276dd71a", new Object[0]);
        }
        Pattern pattern = EMAIL;
        if (pattern != null) {
            return pattern;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(riy.BRACKET_START_STR);
        while (true) {
            String[] strArr = domains;
            if (i < strArr.length) {
                sb.append(strArr[i]);
                sb.append("|");
                i++;
            } else {
                sb.deleteCharAt(sb.length() - 1);
                sb.append(riy.BRACKET_END_STR);
                Pattern compile = Pattern.compile("[[0-9a-zA-Z_]!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+" + sb.toString());
                EMAIL = compile;
                return compile;
            }
        }
    }
}
