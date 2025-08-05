package tb;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class hgf extends hfz {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static boolean h;

    public static /* synthetic */ Object ipc$super(hgf hgfVar, String str, Object... objArr) {
        if (str.hashCode() == -1523321416) {
            super.a((ChatMessage) objArr[0], (TBLiveDataModel) objArr[1]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    static {
        kge.a(119139514);
        h = false;
    }

    public hgf(ViewGroup viewGroup, View view, a aVar) {
        super(view, viewGroup, aVar);
        this.f = (TextView) view.findViewById(R.id.taolive_chat_item_content);
        this.g = (TextView) view.findViewById(R.id.taolive_chat_item_action);
        this.f28605a = (TextView) view.findViewById(R.id.taolive_chat_item_name);
    }

    @Override // tb.hfy
    public void a(ChatMessage chatMessage, final TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a533f5b8", new Object[]{this, chatMessage, tBLiveDataModel});
            return;
        }
        super.a(chatMessage, tBLiveDataModel);
        TextView textView = this.f28605a;
        textView.setText(chatMessage.mUserNick + " ");
        this.f.setText(chatMessage.mContent);
        if (tBLiveDataModel == null || this.j) {
            this.g.setVisibility(8);
            return;
        }
        if (!h) {
            h = true;
            phg.a().a((a) this.e, "Show-ShareLive", new HashMap<>());
        }
        this.g.setVisibility(0);
        this.g.setText("我也分享");
        this.g.setOnClickListener(new View.OnClickListener() { // from class: tb.hgf.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    a();
                }
            }

            private void a() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("56c6c68", new Object[]{this});
                    return;
                }
                VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
                HashMap hashMap = new HashMap();
                hashMap.put("sharelive_location", tfu.COMMENT);
                phg.b().a((Activity) hgf.this.itemView.getContext(), videoInfo.landScape, hashMap);
            }
        });
        a();
    }
}
