package tb;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.activelocation.location.impl.a;
import com.taobao.activelocation.location.impl.b;
import com.taobao.activelocation.location.impl.c;
import com.taobao.location.aidl.ITBLocationCallback;
import com.taobao.location.common.LocationTypeEnum;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class dcv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static String f26698a;

    /* renamed from: tb.dcv$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f26699a = new int[LocationTypeEnum.values().length];

        static {
            try {
                f26699a[LocationTypeEnum.GDLOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26699a[LocationTypeEnum.MEMORYLOCATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26699a[LocationTypeEnum.NLPLOCATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        kge.a(-23900735);
        f26698a = "济源市、仙桃市、潜江市、天门市、神农架林区、五指山市、文昌市、琼海市、万宁市、东方市、定安县、屯昌县、澄迈县、临高县、琼中黎族苗族自治县、保亭黎族苗族自治县、白沙黎族自治县、昌江黎族自治县、乐东黎族自治县、陵水黎族自治县、石河子市、阿拉尔市、图木舒克市、五家渠市、北屯市、铁门关市、双河市、可克达拉市、昆玉市";
    }

    public static dcr a(int i, Handler handler, TBLocationOption tBLocationOption, ITBLocationCallback iTBLocationCallback, dcs dcsVar, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dcr) ipChange.ipc$dispatch("7fa812f3", new Object[]{new Integer(i), handler, tBLocationOption, iTBLocationCallback, dcsVar, hashMap});
        }
        int i2 = AnonymousClass1.f26699a[LocationTypeEnum.valueOfType(i).ordinal()];
        if (i2 == 1) {
            return new a(handler, tBLocationOption, iTBLocationCallback, hashMap);
        }
        if (i2 == 2) {
            return new b(handler, tBLocationOption, iTBLocationCallback, dcsVar, hashMap);
        }
        if (i2 == 3) {
            return new c(handler, tBLocationOption, iTBLocationCallback, hashMap);
        }
        return null;
    }

    public static void a(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d6c9b8", new Object[]{tBLocationDTO});
            return;
        }
        tBLocationDTO.cityCode = "330100";
        tBLocationDTO.cityName = "杭州";
        tBLocationDTO.countryName = "中国";
        tBLocationDTO.countryCode = "中国";
        tBLocationDTO.longitude = "118.915499";
        tBLocationDTO.latitude = "29.547461";
        tBLocationDTO.address = "";
        tBLocationDTO.accuracy = 1000;
        tBLocationDTO.locationType = Integer.valueOf(LocationTypeEnum.NOLOCATION.getType());
        tBLocationDTO.timeStamp = Long.valueOf(System.currentTimeMillis());
    }

    public static String[] a(double[] dArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("a7375840", new Object[]{dArr});
        }
        String[] strArr = new String[2];
        String d = Double.toString(dArr[0]);
        int indexOf = d.indexOf(".");
        String substring = d.substring(0, indexOf);
        String substring2 = d.substring(indexOf + 1);
        if (substring2.length() > 6) {
            substring2 = substring2.substring(0, 6);
        }
        strArr[0] = substring + "." + substring2;
        String d2 = Double.toString(dArr[1]);
        int indexOf2 = d2.indexOf(".");
        String substring3 = d2.substring(0, indexOf2);
        String substring4 = d2.substring(indexOf2 + 1);
        if (substring4.length() > 6) {
            substring4 = substring4.substring(0, 6);
        }
        strArr[1] = substring3 + "." + substring4;
        return strArr;
    }

    public static String b(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae9d5c7", new Object[]{tBLocationDTO});
        }
        return "通过经纬度查地址成功!lon:" + tBLocationDTO.longitude + ",lat:" + tBLocationDTO.latitude + ",citycode:" + tBLocationDTO.cityCode + ",cityName:" + tBLocationDTO.cityName + ",address:" + tBLocationDTO.getAddress();
    }

    public static TBLocationDTO a(Context context) {
        SharedPreferences sharedPreferences;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("d59c2246", new Object[]{context});
        }
        TBLocationDTO tBLocationDTO = null;
        if (context == null || (sharedPreferences = context.getSharedPreferences("tb_passive_location91", 0)) == null || !sharedPreferences.getBoolean("location_mock_on", false)) {
            return null;
        }
        String string = sharedPreferences.getString("location_mock_data", null);
        if (StringUtils.isEmpty(string)) {
            return null;
        }
        String[] split = string.split("_");
        if (split.length != 5) {
            return null;
        }
        String str = split[0];
        String str2 = split[1];
        String str3 = split[2];
        String str4 = split[3];
        String str5 = split[4];
        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
            tBLocationDTO = new TBLocationDTO();
            tBLocationDTO.longitude = str;
            tBLocationDTO.latitude = str2;
            if (!"-1".equals(str5)) {
                tBLocationDTO.address = str5;
            }
            if (!"-1".equals(str3)) {
                tBLocationDTO.cityCode = str3;
            }
            if (!"-1".equals(str4)) {
                tBLocationDTO.cityName = str4;
            }
            tBLocationDTO.isNavSuccess = true;
            tBLocationDTO.timeStamp = Long.valueOf(System.currentTimeMillis());
            tBLocationDTO.locationType = Integer.valueOf(LocationTypeEnum.GPSLOCATION.getType());
            nea.a("Test", "读取mock数据:" + b(tBLocationDTO));
        }
        return tBLocationDTO;
    }
}
