package tb;

import mtopsdk.common.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.b;
import com.taobao.android.searchbaseframe.util.k;
import java.lang.reflect.Array;

/* loaded from: classes3.dex */
public class crd extends crc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DETECT_HEIGHT = 320;
    public static final int DETECT_WIDTH = 192;
    private float f;
    private float g;
    private String[] h;
    private int i;
    private int j;
    private float[][] k;
    private float[] l;
    private float[] m;
    private String n;

    static {
        kge.a(863548362);
    }

    @Override // tb.crc
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "object_detect";
    }

    @Override // tb.crc
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : "6002";
    }

    @Override // tb.crc
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public crd(String str) {
        this.f = 0.3f;
        float f = 0.5f;
        this.g = 0.5f;
        this.i = DETECT_WIDTH;
        this.j = 320;
        this.f26462a = "object_detect";
        String b = b.b(str, "");
        n();
        this.d = 0;
        if (StringUtils.isEmpty(b)) {
            return;
        }
        k.f("自动识别", b, new Object[0]);
        try {
            JSONObject parseObject = JSON.parseObject(b);
            this.b = parseObject.getString("url");
            JSONArray jSONArray = parseObject.getJSONArray("anchors");
            JSONArray jSONArray2 = parseObject.getJSONArray("tensors");
            JSONArray jSONArray3 = parseObject.getJSONArray("norms");
            JSONArray jSONArray4 = parseObject.getJSONArray("means");
            a(jSONArray);
            b(jSONArray2);
            c(jSONArray3);
            d(jSONArray4);
            this.i = parseObject.getIntValue("detectWidth");
            this.j = parseObject.getIntValue("detectHeight");
            Float f2 = parseObject.getFloat("detThreshold");
            this.f = f2 == null ? 0.2f : f2.floatValue();
            Float f3 = parseObject.getFloat("detNmsThreshold");
            if (f3 != null) {
                f = f3.floatValue();
            }
            this.g = f;
            this.c = parseObject.getString("md5");
        } catch (Exception unused) {
            n();
        }
    }

    private void a(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad9ea590", new Object[]{this, jSONArray});
            return;
        }
        int size = jSONArray.size();
        int size2 = jSONArray.getJSONArray(0).size();
        this.k = (float[][]) Array.newInstance(float.class, size, size2);
        for (int i = 0; i < size; i++) {
            JSONArray jSONArray2 = jSONArray.getJSONArray(i);
            for (int i2 = 0; i2 < size2; i2++) {
                this.k[i][i2] = jSONArray2.getFloatValue(i2);
            }
        }
    }

    private void b(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1467911", new Object[]{this, jSONArray});
            return;
        }
        this.h = new String[jSONArray.size()];
        while (true) {
            String[] strArr = this.h;
            if (i >= strArr.length) {
                return;
            }
            strArr[i] = jSONArray.getString(i);
            i++;
        }
    }

    private void c(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4ee4c92", new Object[]{this, jSONArray});
            return;
        }
        this.l = new float[jSONArray.size()];
        for (int i = 0; i < jSONArray.size(); i++) {
            this.l[i] = jSONArray.getFloatValue(i);
        }
    }

    private void d(JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8962013", new Object[]{this, jSONArray});
            return;
        }
        this.m = new float[jSONArray.size()];
        for (int i = 0; i < jSONArray.size(); i++) {
            this.m[i] = jSONArray.getFloatValue(i);
        }
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        this.h = new String[]{"output_p3", "output_p4", "output_p5"};
        this.i = DETECT_WIDTH;
        this.j = 320;
        this.b = "https://files.alicdn.com/tpsservice/424912c59932fd011f24dc17a2cd92ce.zip";
        this.c = "05f400a84da1e359789ead2363b7f2b8";
        this.n = "OPVhtHNuV5Mu0O/TPNV8ZSF/1OHV0YACFek/JGOGVYtMAlcwBWOCbk/9Imgyr5+XOVSoXcjrwMUEo93MCeVGJD0yym1d06BAmz2oME6EipI=";
        this.f = 0.6f;
        this.g = 0.5f;
        this.k = new float[][]{new float[]{10.0f, 13.0f, 16.0f, 30.0f, 33.0f, 23.0f}, new float[]{30.0f, 61.0f, 62.0f, 45.0f, 59.0f, 119.0f}, new float[]{116.0f, 90.0f, 156.0f, 198.0f, 373.0f, 326.0f}};
        this.l = new float[]{0.003921569f, 0.003921569f, 0.003921569f};
        this.m = new float[]{0.0f, 0.0f, 0.0f};
    }

    public String[] f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String[]) ipChange.ipc$dispatch("3a68f47c", new Object[]{this}) : this.h;
    }

    public float[][] g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (float[][]) ipChange.ipc$dispatch("996873fe", new Object[]{this}) : this.k;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10e2", new Object[]{this})).intValue() : this.i;
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.j;
    }

    public float j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe1", new Object[]{this})).floatValue() : this.f;
    }

    public float k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95762", new Object[]{this})).floatValue() : this.g;
    }

    public float[] l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("bae6704e", new Object[]{this}) : this.l;
    }

    public float[] m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("bc9b48ed", new Object[]{this}) : this.m;
    }

    @Override // tb.crc
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.n;
    }
}
