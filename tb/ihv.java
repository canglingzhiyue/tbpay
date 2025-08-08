package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class ihv extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_RESOLVE_WIDTH = -5214069675035118580L;

    static {
        kge.a(-784259173);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        int parseInt;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr != null && objArr.length >= 2) {
            try {
                String str = (String) objArr[0];
                String str2 = (String) objArr[1];
                if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
                    Matcher matcher = Pattern.compile("-(\\d+)-(\\d+)\\.").matcher(str);
                    if (!matcher.find()) {
                        return "match_content";
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (!StringUtils.isEmpty(group) && !StringUtils.isEmpty(group2)) {
                        float parseFloat = Float.parseFloat(group);
                        float parseFloat2 = Float.parseFloat(group2);
                        if (parseFloat != 0.0f && parseFloat2 != 0.0f) {
                            float f = parseFloat / parseFloat2;
                            Matcher matcher2 = Pattern.compile("^(\\d+)(\\D+)?$").matcher(str2);
                            if (!matcher2.find()) {
                                return "match_content";
                            }
                            String group3 = matcher2.group(1);
                            String group4 = matcher2.group(2);
                            if (group4 == null) {
                                group4 = "";
                            }
                            if (StringUtils.isEmpty(group3) || (parseInt = Integer.parseInt(group3)) <= 0) {
                                return "match_content";
                            }
                            return ((int) (parseInt * f)) + group4;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return "match_content";
    }
}
