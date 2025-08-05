package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.config.b;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class crf extends crc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int f;
    public int g;
    private float h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float[] m = {123.675f, 116.28f, 103.53f};
    private float[] n = {0.017124753f, 0.017507004f, 0.017429193f};

    static {
        kge.a(-170530408);
    }

    @Override // tb.crc
    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : "video_track";
    }

    @Override // tb.crc
    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : "5002";
    }

    @Override // tb.crc
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : "jiQbKdmJeaNhfamRe/pHiu0X2D3PCpDM8tKVDvknyoQTWh7NX+UMB2sTOQ1nMyWN+WAUkug8jaQ9T+bxDD5yXMGPQXfDEdyOCibERaZibr4=";
    }

    @Override // tb.crc
    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public crf() {
        this.h = 0.95f;
        this.f = 224;
        this.g = 224;
        JSONObject i = b.i();
        if (i == null) {
            o();
        } else {
            try {
                this.b = i.getString("url");
                this.c = i.getString("md5");
                this.d = i.getInt("mode");
                this.f = i.getInt("detectWidth");
                this.g = i.getInt("detectHeight");
                this.i = (float) i.getDouble("vipDetectThreshold");
                this.j = (float) i.getDouble("vipAreaRatio");
                this.k = (float) i.getDouble("vipTrackletOverallRatio");
                this.l = (float) i.getDouble("vipTrackletFirstSecondRatio");
                this.h = (float) i.getDouble("threshold");
                JSONArray jSONArray = i.getJSONArray("norms");
                b(i.getJSONArray("means"));
                a(jSONArray);
            } catch (Exception unused) {
                o();
            }
        }
        this.f26462a = "video_track";
    }

    private void a(JSONArray jSONArray) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6e9f902", new Object[]{this, jSONArray});
            return;
        }
        this.n = new float[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            this.n[i] = (float) jSONArray.getDouble(i);
        }
    }

    private void b(JSONArray jSONArray) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b1a4603", new Object[]{this, jSONArray});
            return;
        }
        this.m = new float[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            this.m[i] = (float) jSONArray.getDouble(i);
        }
    }

    public float f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5b2e1dd", new Object[]{this})).floatValue() : this.l;
    }

    public float g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f95e", new Object[]{this})).floatValue() : this.i;
    }

    public float h() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5cf10df", new Object[]{this})).floatValue() : this.j;
    }

    public float i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2860", new Object[]{this})).floatValue() : this.k;
    }

    public float j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5eb3fe1", new Object[]{this})).floatValue() : this.h;
    }

    public int k() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5f95765", new Object[]{this})).intValue() : this.f;
    }

    public int l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("6076ee6", new Object[]{this})).intValue() : this.g;
    }

    public float[] m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("bc9b48ed", new Object[]{this}) : this.m;
    }

    public float[] n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (float[]) ipChange.ipc$dispatch("be50218c", new Object[]{this}) : this.n;
    }

    private void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b576", new Object[]{this});
            return;
        }
        this.b = "https://files.alicdn.com/tpsservice/1ebc2946399d979137e79711fadcf76e.zip";
        this.c = "6e770dd00962be9680fe820a2a7d6d80";
        this.d = 0;
        this.h = 0.95f;
        this.i = 0.8f;
        this.j = 0.5f;
        this.k = 0.5f;
        this.l = 2.0f;
        this.f = 224;
        this.g = 224;
        this.m = new float[]{123.675f, 116.28f, 103.53f};
        this.n = new float[]{0.017124753f, 0.017507004f, 0.017429193f};
    }
}
