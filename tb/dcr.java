package tb;

import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.activelocation.location.impl.b;
import com.taobao.location.aidl.ITBLocationCallback;
import com.taobao.location.common.LocationErrorCode;
import com.taobao.location.common.LocationTypeEnum;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.location.common.TBLocationOption;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.Globals;
import java.util.HashMap;

/* loaded from: classes4.dex */
public abstract class dcr {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TBLocationOption f26693a;
    public Application b = Globals.getApplication();
    private ITBLocationCallback c;
    private Handler d;
    private LocationTypeEnum e;
    private HashMap<String, String> f;

    static {
        kge.a(178091024);
    }

    public abstract void a();

    public abstract LocationTypeEnum c();

    public dcr(Handler handler, TBLocationOption tBLocationOption, ITBLocationCallback iTBLocationCallback, LocationTypeEnum locationTypeEnum, HashMap<String, String> hashMap) {
        this.d = handler;
        this.f26693a = tBLocationOption;
        this.c = iTBLocationCallback;
        this.e = locationTypeEnum;
        this.f = hashMap;
    }

    public final void a(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d6c9b8", new Object[]{this, tBLocationDTO});
            return;
        }
        if (!(this instanceof b) || "true".equalsIgnoreCase(OrangeConfig.getInstance().getConfig("gps", "absLocationAlwaysUpdateTs", "false"))) {
            tBLocationDTO.timeStamp = Long.valueOf(System.currentTimeMillis());
        }
        tBLocationDTO.isNavSuccess = true;
        tBLocationDTO.locationType = Integer.valueOf(this.e.getType());
        tBLocationDTO.errorCode = Integer.valueOf(LocationErrorCode.SUCCESS.code);
        Message obtainMessage = this.d.obtainMessage(0, this.c);
        Bundle bundle = new Bundle();
        bundle.putParcelable(dcq.c, tBLocationDTO);
        bundle.putParcelable(dcq.b, this.f26693a);
        obtainMessage.setData(bundle);
        this.d.sendMessage(obtainMessage);
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else {
            a((HashMap<String, String>) null);
        }
    }

    public final void a(HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656bbc4b", new Object[]{this, hashMap});
            return;
        }
        Message obtainMessage = this.d.obtainMessage(1, this.c);
        Bundle bundle = new Bundle();
        LocationTypeEnum c = c();
        if (c != null) {
            bundle.putInt(dcq.f26692a, c.getType());
        }
        bundle.putParcelable(dcq.b, this.f26693a);
        if (hashMap != null) {
            bundle.putString(dcq.d, hashMap.get(dcq.d));
            bundle.putString(dcq.e, hashMap.get(dcq.e));
        } else if (this.f != null) {
            bundle.putString(dcq.d, this.f.get(dcq.d));
            bundle.putString(dcq.e, this.f.get(dcq.e));
        }
        obtainMessage.setData(bundle);
        this.d.sendMessage(obtainMessage);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(dcq.d, (Object) bundle.getString(dcq.d));
        jSONObject.put(dcq.e, (Object) bundle.getString(dcq.e));
        try {
            AppMonitor.Counter.commit("passivelocation", this.e.name(), jSONObject.toString(), 1.0d);
        } catch (JSONException unused) {
        }
    }

    public void a(LocationTypeEnum locationTypeEnum) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92236bec", new Object[]{this, locationTypeEnum});
        } else {
            this.e = locationTypeEnum;
        }
    }
}
