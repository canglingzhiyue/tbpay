package com.taobao.message.notification.banner.dx;

import android.view.View;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.android.dinamicx.DXEngineConfig;
import com.taobao.android.dinamicx.DXResult;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.tao.log.TLog;
import com.taobao.unit.center.mdc.MsgDinamicxEngine;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.q;
import kotlin.t;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.fxa;
import tb.kge;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0002J\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u0006\u0010\u0012\u001a\u00020\u000eJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/taobao/message/notification/banner/dx/DynamicSimpleComponent;", "", "props", "Lcom/taobao/message/notification/banner/dx/DynamicSimpleProps;", "(Lcom/taobao/message/notification/banner/dx/DynamicSimpleProps;)V", "mEngine", "Lcom/taobao/android/dinamicx/DinamicXEngine;", "mResultDXTemplateItem", "Lcom/taobao/android/dinamicx/template/download/DXTemplateItem;", "mView", "Lcom/taobao/android/dinamicx/DXRootView;", "getProps", "()Lcom/taobao/message/notification/banner/dx/DynamicSimpleProps;", "downloadTemplate", "", AdvanceSetting.NETWORK_TYPE, "getUIView", "Landroid/view/View;", "mount", "render", "", "unmount", "Companion", "notification_sdk_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes7.dex */
public final class DynamicSimpleComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Companion Companion;
    public static final String TAG = "cbq@inAppPush";
    private DinamicXEngine mEngine;
    private DXTemplateItem mResultDXTemplateItem;
    private DXRootView mView;
    private final DynamicSimpleProps props;

    static {
        kge.a(2071018573);
        Companion = new Companion(null);
    }

    public final void unmount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4059a7", new Object[]{this});
        }
    }

    public DynamicSimpleComponent(DynamicSimpleProps props) {
        q.c(props, "props");
        this.props = props;
    }

    public final DynamicSimpleProps getProps() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DynamicSimpleProps) ipChange.ipc$dispatch("28b2dba4", new Object[]{this}) : this.props;
    }

    public final View getUIView() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("7092d1f8", new Object[]{this}) : this.mView;
    }

    public final void mount() {
        t tVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b2c0c20", new Object[]{this});
            return;
        }
        DXEngineConfig.a aVar = new DXEngineConfig.a("alimp_message");
        aVar.b(MsgDinamicxEngine.DX_SUB_BIZTYPE_MESSAGE_CHAT_COMPAT);
        try {
            aVar.h(true);
        } catch (Throwable unused) {
        }
        this.mEngine = new DinamicXEngine(aVar.a());
        DinamicXEngine dinamicXEngine = this.mEngine;
        if (dinamicXEngine == null) {
            q.b("mEngine");
        }
        dinamicXEngine.a(fxa.a("mpTapV2"), TapEventHandlerProxy.INSTANCE);
        DXTemplateItem mDXTemplateItem = this.props.getMDXTemplateVO().getMDXTemplateItem();
        if (mDXTemplateItem == null) {
            return;
        }
        DinamicXEngine dinamicXEngine2 = this.mEngine;
        if (dinamicXEngine2 == null) {
            q.b("mEngine");
        }
        this.mResultDXTemplateItem = dinamicXEngine2.a(mDXTemplateItem);
        DXTemplateItem dXTemplateItem = this.mResultDXTemplateItem;
        t tVar2 = null;
        if (dXTemplateItem == null) {
            downloadTemplate(mDXTemplateItem);
            tVar2 = t.INSTANCE;
        } else {
            if (dXTemplateItem == null) {
                q.a();
            }
            if (dXTemplateItem.b != mDXTemplateItem.b) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.props.getMTemplateId());
                sb.append(" version diff is: ");
                DXTemplateItem dXTemplateItem2 = this.mResultDXTemplateItem;
                if (dXTemplateItem2 == null) {
                    q.a();
                }
                sb.append(dXTemplateItem2.b);
                sb.append(" != ");
                sb.append(mDXTemplateItem.b);
                TLog.loge(TAG, sb.toString());
                downloadTemplate(mDXTemplateItem);
            }
            TLog.loge(TAG, "fetchTemplate success: " + this.props.getMTemplateId());
            if (this.mResultDXTemplateItem != null) {
                DynamicSimpleOpenPoint mOpenPoint = this.props.getMOpenPoint();
                if (mOpenPoint != null) {
                    mOpenPoint.onBeforeCreateView();
                }
                DinamicXEngine dinamicXEngine3 = this.mEngine;
                if (dinamicXEngine3 == null) {
                    q.b("mEngine");
                }
                this.mView = dinamicXEngine3.b(this.props.getMCtx(), this.mResultDXTemplateItem).f11780a;
                DynamicSimpleOpenPoint mOpenPoint2 = this.props.getMOpenPoint();
                if (mOpenPoint2 != null) {
                    mOpenPoint2.onAfterCreateView(this.mView);
                    tVar = t.INSTANCE;
                } else {
                    tVar = null;
                }
                if (tVar != null) {
                    TLog.loge(TAG, "dinamicX render failed because mResultDXTemplateItem is null: " + this.props.getMTemplateId() + ' ');
                    tVar2 = t.INSTANCE;
                }
            }
        }
        if (tVar2 == null) {
            return;
        }
        TLog.loge(TAG, "mDXTemplateItem is null!: " + this.props.getMTemplateId());
    }

    private final void downloadTemplate(DXTemplateItem dXTemplateItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fda96292", new Object[]{this, dXTemplateItem});
            return;
        }
        TLog.loge(TAG, "fetchTemplate fail: " + this.props.getMTemplateId() + ", start download template: " + dXTemplateItem.toString());
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(dXTemplateItem);
        DinamicXEngine dinamicXEngine = this.mEngine;
        if (dinamicXEngine == null) {
            q.b("mEngine");
        }
        dinamicXEngine.a(arrayList);
    }

    public final boolean render() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("471a0b21", new Object[]{this})).booleanValue();
        }
        DynamicSimpleOpenPoint mOpenPoint = this.props.getMOpenPoint();
        if (mOpenPoint != null) {
            mOpenPoint.onBeforeRender();
        }
        if (this.mView != null) {
            DinamicXEngine dinamicXEngine = this.mEngine;
            if (dinamicXEngine == null) {
                q.b("mEngine");
            }
            DXResult<DXRootView> dxResult = dinamicXEngine.a(this.mView, this.props.getMDXTemplateVO().getMData());
            if (dxResult.f11780a != null && this.mView != null) {
                TLog.loge(TAG, "dinamicX render success: " + this.props.getMTemplateId());
                DynamicSimpleOpenPoint mOpenPoint2 = this.props.getMOpenPoint();
                if (mOpenPoint2 != null) {
                    mOpenPoint2.onAfterRender(0);
                }
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("dinamicX render failed: ");
            sb.append(this.props.getMTemplateId());
            sb.append(ResponseProtocolType.COMMENT);
            if (dxResult.b()) {
                q.a((Object) dxResult, "dxResult");
                str = dxResult.a().toString();
            } else {
                str = "";
            }
            sb.append(str);
            TLog.loge(TAG, sb.toString());
            t tVar = t.INSTANCE;
            TLog.loge(TAG, "dinamicX render failed because mView is null: " + this.props.getMTemplateId() + ' ');
        }
        DynamicSimpleOpenPoint mOpenPoint3 = this.props.getMOpenPoint();
        if (mOpenPoint3 != null) {
            mOpenPoint3.onAfterRender(1);
        }
        return false;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/taobao/message/notification/banner/dx/DynamicSimpleComponent$Companion;", "", "()V", RPCDataItems.SWITCH_TAG_LOG, "", "notification_sdk_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes7.dex */
    public static final class Companion {
        static {
            kge.a(-2106594475);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
