package com.taobao.tao.flexbox.layoutmanager.save;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.taobao.windvane.jsbridge.e;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.umipublish.draft.b;
import org.json.JSONObject;
import tb.kge;

/* loaded from: classes8.dex */
public class TBSNSWVSavePlugin extends e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final String SAVE = b.ACTION_TYPE_SAVE;

    static {
        kge.a(1849456880);
    }

    public static /* synthetic */ Object ipc$super(TBSNSWVSavePlugin tBSNSWVSavePlugin, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.taobao.windvane.jsbridge.e
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if (!b.ACTION_TYPE_SAVE.equals(str)) {
            return false;
        }
        return save(str2);
    }

    private boolean save(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("30121052", new Object[]{this, str})).booleanValue();
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("src");
            String optString2 = jSONObject.optString("waterMarkText");
            String optString3 = jSONObject.optString("waterMarkIconUrl");
            a aVar = new a(this.mContext, optString);
            aVar.a(optString2, optString3);
            aVar.a();
        } catch (Exception e) {
            TLog.loge("TBSNSWVSavePlugin", "save exception", e);
        }
        return false;
    }
}
