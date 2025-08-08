package com.taobao.relationship.weex;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.ir.runtime.ApplicationInvoker;
import com.taobao.relationship.application.RelationshipApplication;
import com.taobao.tao.TaobaoApplication;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.IExternalComponentGetter;
import com.taobao.weex.ui.component.WXComponent;
import tb.kge;

/* loaded from: classes7.dex */
public class FollowWeexSerivice extends Service implements IExternalComponentGetter {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FOLLOW_WEEX_BUTTON = "followsdkbutton";

    static {
        kge.a(-207797734);
        kge.a(827327188);
    }

    public static /* synthetic */ Object ipc$super(FollowWeexSerivice followWeexSerivice, String str, Object... objArr) {
        if (str.hashCode() == 413640386) {
            super.onCreate();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }

    public FollowWeexSerivice() {
        ApplicationInvoker.getInstance("com.taobao.relationship").invoke("com.taobao.relationship.application.RelationshipApplication", TaobaoApplication.sApplication);
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        RelationshipApplication.init();
    }

    @Override // com.taobao.weex.ui.IExternalComponentGetter
    public Class<? extends WXComponent> getExternalComponentClass(String str, WXSDKInstance wXSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("464bab4e", new Object[]{this, str, wXSDKInstance});
        }
        if (!StringUtils.equals(FOLLOW_WEEX_BUTTON, str)) {
            return null;
        }
        return FollowWeexComponent.class;
    }
}
