package tb;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class hgb extends hfz {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1232301401);
    }

    public static /* synthetic */ Object ipc$super(hgb hgbVar, String str, Object... objArr) {
        if (str.hashCode() == -1523321416) {
            super.a((ChatMessage) objArr[0], (TBLiveDataModel) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ void a(hgb hgbVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4486373f", new Object[]{hgbVar, str});
        } else {
            hgbVar.a(str);
        }
    }

    public hgb(ViewGroup viewGroup, View view, a aVar) {
        super(view, viewGroup, aVar);
        this.f = (TextView) view.findViewById(R.id.taolive_chat_item_content);
        this.g = (TextView) view.findViewById(R.id.taolive_chat_item_action);
        this.f28605a = (TextView) view.findViewById(R.id.taolive_chat_item_name);
    }

    @Override // tb.hfy
    public void a(ChatMessage chatMessage, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a533f5b8", new Object[]{this, chatMessage, tBLiveDataModel});
            return;
        }
        super.a(chatMessage, tBLiveDataModel);
        TextView textView = this.f28605a;
        textView.setText(chatMessage.mUserNick + " ");
        this.f.setText(chatMessage.mContent);
        if (tBLiveDataModel == null) {
            this.g.setVisibility(8);
            return;
        }
        String str = chatMessage.renders.get("actionTitle");
        final String str2 = chatMessage.renders.get("actionUrl");
        if (str2.startsWith("tblive://intimacyIssue")) {
            phg.a().a((a) this.e, "Show-fansgrowth", (HashMap<String, String>) null);
        }
        this.g.setVisibility(0);
        this.g.setText(str);
        this.g.setOnClickListener(new View.OnClickListener() { // from class: tb.hgb.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    hgb.a(hgb.this, str2);
                }
            }
        });
        a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(java.lang.String r7) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.hgb.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            r2 = 1
            r3 = 2
            r4 = 0
            if (r1 == 0) goto L15
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r4] = r6
            r1[r2] = r7
            java.lang.String r7 = "f3a64c32"
            r0.ipc$dispatch(r7, r1)
            return
        L15:
            java.net.URI r7 = java.net.URI.create(r7)     // Catch: java.lang.Exception -> L81
            java.lang.String r7 = r7.getHost()     // Catch: java.lang.Exception -> L81
            r0 = -1
            int r1 = r7.hashCode()     // Catch: java.lang.Exception -> L81
            r5 = -1861850923(0xffffffff910668d5, float:-1.060304E-28)
            if (r1 == r5) goto L28
            goto L31
        L28:
            java.lang.String r1 = "intimacyIssue"
            boolean r7 = r7.equals(r1)     // Catch: java.lang.Exception -> L81
            if (r7 == 0) goto L31
            r0 = 0
        L31:
            if (r0 == 0) goto L34
            goto L81
        L34:
            java.util.HashMap r7 = new java.util.HashMap     // Catch: java.lang.Exception -> L81
            r7.<init>()     // Catch: java.lang.Exception -> L81
            com.taobao.taolive.sdk.model.TBLiveDataModel r0 = r6.c     // Catch: java.lang.Exception -> L81
            com.taobao.taolive.sdk.model.common.VideoInfo r0 = r0.mVideoInfo     // Catch: java.lang.Exception -> L81
            java.lang.String r1 = "isLandscape"
            if (r0 == 0) goto L46
            boolean r0 = r0.landScape     // Catch: java.lang.Exception -> L81
            if (r0 == 0) goto L46
            goto L47
        L46:
            r2 = 0
        L47:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> L81
            r7.put(r1, r0)     // Catch: java.lang.Exception -> L81
            java.lang.String r0 = "status"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L81
            r7.put(r0, r1)     // Catch: java.lang.Exception -> L81
            tb.phq r0 = r6.e     // Catch: java.lang.Exception -> L81
            if (r0 == 0) goto L74
            tb.phq r0 = r6.e     // Catch: java.lang.Exception -> L81
            com.taobao.tbliveinteractive.e r0 = r0.p()     // Catch: java.lang.Exception -> L81
            if (r0 == 0) goto L74
            tb.phq r0 = r6.e     // Catch: java.lang.Exception -> L81
            com.taobao.tbliveinteractive.e r0 = r0.p()     // Catch: java.lang.Exception -> L81
            com.taobao.tbliveinteractive.b r0 = r0.h()     // Catch: java.lang.Exception -> L81
            java.lang.String r1 = tb.qne.f()     // Catch: java.lang.Exception -> L81
            r0.g(r1, r7)     // Catch: java.lang.Exception -> L81
        L74:
            tb.phl r7 = tb.phg.a()     // Catch: java.lang.Exception -> L81
            tb.phq r0 = r6.e     // Catch: java.lang.Exception -> L81
            java.lang.String r1 = "fansgrowth"
            java.lang.String[] r2 = new java.lang.String[r4]     // Catch: java.lang.Exception -> L81
            r7.a(r0, r1, r2)     // Catch: java.lang.Exception -> L81
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.hgb.a(java.lang.String):void");
    }
}
