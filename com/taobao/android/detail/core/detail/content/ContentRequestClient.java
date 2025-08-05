package com.taobao.android.detail.core.detail.content;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.boost.annotations.MtopParams;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.lang.ref.WeakReference;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.emu;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class ContentRequestClient {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final ContentRequestParams f9445a;
    private final HandlerThread b = new HandlerThread("content request");
    private final Handler c;

    static {
        kge.a(1490209424);
    }

    public ContentRequestClient(String str, String str2, String str3) {
        this.f9445a = new ContentRequestParams(str, str2, str3);
        this.b.start();
        this.c = new Handler(this.b.getLooper());
        emu.a("com.taobao.android.detail.core.detail.content.ContentRequestClient");
    }

    public void a(String str, String str2, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3de9ae7a", new Object[]{this, str, str2, iRemoteBaseListener});
            return;
        }
        this.f9445a.setSeeIds(str);
        this.f9445a.setTab(str2);
        a(this.f9445a, epo.f(), iRemoteBaseListener).asyncRequest();
    }

    private RemoteBusiness a(ContentRequestParams contentRequestParams, String str, IRemoteBaseListener iRemoteBaseListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RemoteBusiness) ipChange.ipc$dispatch("61a6ea76", new Object[]{this, contentRequestParams, str, iRemoteBaseListener});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setData(JSONObject.toJSONString(contentRequestParams.toMap()));
        mtopRequest.setApiName("mtop.taobao.detail.content.list");
        mtopRequest.setVersion("1.0");
        RemoteBusiness build = RemoteBusiness.build(mtopRequest, str);
        build.registerListener((IRemoteListener) new RemoteBaseListenerProxy(iRemoteBaseListener));
        build.mo1328setUnitStrategy(MtopParams.UnitStrategy.UNIT_TRADE.toString());
        build.mo1340setBizId(9998);
        build.mo1296handler(this.c);
        return build;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (Build.VERSION.SDK_INT >= 18) {
            this.b.quitSafely();
        } else {
            this.b.quit();
        }
    }

    /* loaded from: classes4.dex */
    public static class RemoteBaseListenerProxy implements IRemoteBaseListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private WeakReference<IRemoteBaseListener> mRefListener;

        static {
            kge.a(-581922577);
            kge.a(-525336021);
        }

        public RemoteBaseListenerProxy(IRemoteBaseListener iRemoteBaseListener) {
            this.mRefListener = new WeakReference<>(iRemoteBaseListener);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
        public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            IRemoteBaseListener iRemoteBaseListener = this.mRefListener.get();
            if (iRemoteBaseListener == null) {
                return;
            }
            iRemoteBaseListener.onSystemError(i, mtopResponse, obj);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                return;
            }
            IRemoteBaseListener iRemoteBaseListener = this.mRefListener.get();
            if (iRemoteBaseListener == null) {
                return;
            }
            iRemoteBaseListener.onSuccess(i, mtopResponse, baseOutDo, obj);
        }

        @Override // com.taobao.tao.remotebusiness.IRemoteListener
        public void onError(int i, MtopResponse mtopResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                return;
            }
            IRemoteBaseListener iRemoteBaseListener = this.mRefListener.get();
            if (iRemoteBaseListener == null) {
                return;
            }
            iRemoteBaseListener.onError(i, mtopResponse, obj);
        }
    }
}
