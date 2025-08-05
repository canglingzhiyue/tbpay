package com.alipay.android.msp.ui.widget.dialog;

import android.content.DialogInterface;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class FlybirdDialogEventDesc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public DialogInterface.OnClickListener mListener;
    public String mText;

    /* loaded from: classes3.dex */
    public interface DialogCallback {
        void onCallback(String str);
    }

    public FlybirdDialogEventDesc(String str, DialogInterface.OnClickListener onClickListener) {
        this.mText = str;
        this.mListener = onClickListener;
    }

    public static FlybirdDialogEventDesc build(String str, final JSONObject jSONObject, final DialogCallback dialogCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FlybirdDialogEventDesc) ipChange.ipc$dispatch("2aa9f282", new Object[]{str, jSONObject, dialogCallback});
        }
        LogUtil.record(1, "", "FlybirdDialogEventDesc::build2", "text:" + str + ",action=" + jSONObject);
        return new FlybirdDialogEventDesc(str, new DialogInterface.OnClickListener() { // from class: com.alipay.android.msp.ui.widget.dialog.FlybirdDialogEventDesc.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7e49304d", new Object[]{this, dialogInterface, new Integer(i)});
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("index", (Object) String.valueOf(i));
                JSONObject jSONObject3 = JSONObject.this;
                if (jSONObject3 != null && jSONObject3.size() > 0) {
                    for (String str2 : JSONObject.this.keySet()) {
                        jSONObject2.put(str2, (Object) JSONObject.this.getString(str2));
                    }
                }
                DialogCallback dialogCallback2 = dialogCallback;
                if (dialogCallback2 != null) {
                    dialogCallback2.onCallback(jSONObject2.toJSONString());
                } else {
                    PluginManager.getRender().callRender(jSONObject2.toJSONString());
                }
                LogUtil.record(2, "FlybirdDialogEventDesc:onClick", jSONObject2.toJSONString());
            }
        });
    }
}
