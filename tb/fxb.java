package tb;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;

/* loaded from: classes.dex */
public class fxb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ASSET_DIR = "template/";
    public static final String ASSET_PRESET_TEMPLATE_INFOLIST = "/presetTemplateInfos.json";
    public static final String ASSET_PRESET_TEMPLATE_OTHER = "other";
    public static final String ASSET_PRESET_TEMPLATE_VERSION = "version";
    public static final String ASSET_SUB_PRESET_TEMPLATE_INFOLIST = "/subPresetTemplateInfos.json";
    public static final String DB_NAME = "dinamicx";
    public static final String DEFAULT_ROOT_DIR = "dinamicx/";
    public static final char DIR = '/';
    public static final String DX_MAIN_TEMPLATE_NAME = "main.dx";

    static {
        kge.a(-1620052384);
    }

    public static boolean a(String str, DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("4df0205f", new Object[]{str, dXTemplateItem})).booleanValue() : a(dXTemplateItem) && !StringUtils.isEmpty(str);
    }

    public static boolean a(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("3a042615", new Object[]{dXTemplateItem})).booleanValue() : dXTemplateItem != null && !StringUtils.isEmpty(dXTemplateItem.f11925a) && dXTemplateItem.b > -1;
    }

    public static long a(String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b26fab", new Object[]{strArr})).longValue();
        }
        long j = -1;
        if (strArr != null && strArr.length > 0) {
            if (strArr.length == 1) {
                try {
                    return Long.valueOf(strArr[0]).longValue();
                } catch (NumberFormatException unused) {
                    return -1L;
                }
            }
            long j2 = -1;
            for (String str : strArr) {
                try {
                    j2 = Long.valueOf(str).longValue();
                } catch (NumberFormatException unused2) {
                }
                if (j2 > j) {
                    j = j2;
                }
            }
        }
        return j;
    }
}
