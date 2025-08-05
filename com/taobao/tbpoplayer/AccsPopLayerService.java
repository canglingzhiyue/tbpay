package com.taobao.tbpoplayer;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.utils.a;
import com.alibaba.poplayer.utils.f;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.base.TaoBaseService;
import java.util.ArrayList;
import java.util.List;
import tb.kge;

/* loaded from: classes7.dex */
public class AccsPopLayerService extends TaoBaseService {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a */
    private static final List<JSONObject> f22198a;

    public static /* synthetic */ Object ipc$super(AccsPopLayerService accsPopLayerService, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void lambda$t9Whz8SpVO7UvVmdVFDrhmg7TvE(AccsPopLayerService accsPopLayerService, String str) {
        accsPopLayerService.a(str);
    }

    static {
        kge.a(-1336123403);
        f22198a = new ArrayList();
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onData(String str, String str2, String str3, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("694255fc", new Object[]{this, str, str2, str3, bArr, extraInfo});
            return;
        }
        try {
            com.alibaba.poplayer.utils.c.a("BroadcastTrigger.ACCS.onData: serviceId:{%s},userId:{%s},dataId:{%s}.data：{%s}.", str, str2, str3, new String(bArr));
            final String str4 = new String(bArr);
            if (TextUtils.isEmpty(str4)) {
                return;
            }
            f.a(new Runnable() { // from class: com.taobao.tbpoplayer.-$$Lambda$AccsPopLayerService$t9Whz8SpVO7UvVmdVFDrhmg7TvE
                {
                    AccsPopLayerService.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AccsPopLayerService.lambda$t9Whz8SpVO7UvVmdVFDrhmg7TvE(AccsPopLayerService.this, str4);
                }
            });
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("accs onData fail.", th);
        }
    }

    public /* synthetic */ void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                if (parseObject == null) {
                    com.alibaba.poplayer.utils.c.a("UpdateAccsConfigDataTask.AccsActionData is null");
                } else {
                    a(parseObject);
                }
            } catch (Throwable th) {
                com.alibaba.poplayer.utils.c.a("UpdateAccsConfigDataTask.parseObject.fail.", th);
            }
        }
    }

    private void a(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("266fb88", new Object[]{this, jSONObject});
            return;
        }
        try {
            String string = jSONObject.getString("event");
            String string2 = jSONObject.getString("param");
            com.alibaba.poplayer.utils.c.b("triggerEvent", "", "BroadcastTrigger.ACCS.onData.event:{" + string + "},param:{" + string2 + "}.");
            if (PopLayer.isSetup() && a.a().b()) {
                Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
                intent.putExtra("event", string);
                intent.putExtra("param", string2);
                intent.putExtra(PopLayer.EXTRA_KEY_TRIGGER_SROUCE, "accs");
                LocalBroadcastManager.getInstance(getApplicationContext()).sendBroadcast(intent);
                return;
            }
            com.alibaba.poplayer.utils.c.b("triggerEvent", "", "BroadcastTrigger.ACCS.onData.PopLayer is not setup. event:{" + string + "},param:{" + string2 + "}.");
            f22198a.add(jSONObject);
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("accs handleAccsMsg fail.", th);
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onBind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa398db", new Object[]{this, str, new Integer(i), extraInfo});
        } else {
            com.alibaba.poplayer.utils.c.a("ACCS onBind: serviceId:{%s},errorCode:{%s}.", str, Integer.valueOf(i));
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onUnbind(String str, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b4e074", new Object[]{this, str, new Integer(i), extraInfo});
        } else {
            com.alibaba.poplayer.utils.c.a("ACCS onUnbind: serviceId:{%s},errorCode:{%s}.", str, Integer.valueOf(i));
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onSendData(String str, String str2, int i, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f29e89fa", new Object[]{this, str, str2, new Integer(i), extraInfo});
        } else {
            com.alibaba.poplayer.utils.c.a("ACCS onSendData: serviceId:{%s},dataId：{%s},errorCode:{%s}.", str, str2, Integer.valueOf(i));
        }
    }

    @Override // com.taobao.accs.base.AccsDataListener
    public void onResponse(String str, String str2, int i, byte[] bArr, TaoBaseService.ExtraInfo extraInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5239c42", new Object[]{this, str, str2, new Integer(i), bArr, extraInfo});
        } else {
            com.alibaba.poplayer.utils.c.a("ACCS onResponse: serviceId:{%s},dataId：{%s},errorCode:{%s}.", str, str2, Integer.valueOf(i));
        }
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        try {
            com.alibaba.poplayer.utils.c.b("triggerEvent", "", "BroadcastTrigger.ACCS.onData.sendAccsCacheData");
            if (!PopLayer.isSetup()) {
                com.alibaba.poplayer.utils.c.a("ACCS sendAccsCacheData PopLayer is not setup.", new Object[0]);
                return;
            }
            for (JSONObject jSONObject : f22198a) {
                String string = jSONObject.getString("event");
                String string2 = jSONObject.getString("param");
                com.alibaba.poplayer.utils.c.b("triggerEvent", "", "BroadcastTrigger.ACCS.onData.sendAccsCacheData.event:{" + string + "},param:{" + string2 + "}.");
                if (!TextUtils.isEmpty(string)) {
                    Intent intent = new Intent("com.alibaba.poplayer.PopLayer.action.POP");
                    intent.putExtra("event", string);
                    intent.putExtra("param", string2);
                    intent.putExtra(PopLayer.EXTRA_KEY_EXTRA_PARAMS, "waitForSetUp");
                    intent.putExtra(PopLayer.EXTRA_KEY_TRIGGER_SROUCE, "accs");
                    LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
                }
            }
            f22198a.clear();
        } catch (Throwable th) {
            com.alibaba.poplayer.utils.c.a("accs fail.", th);
        }
    }
}
