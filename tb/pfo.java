package tb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.alilive.adapter.uikit.AliUrlImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.controller.k;
import com.taobao.taolive.sdk.goodlist.d;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.utils.u;
import java.util.HashMap;

/* loaded from: classes8.dex */
public class pfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(351844522);
    }

    public static void a(Context context, VideoInfo videoInfo, FrameLayout frameLayout, final a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ae7ee55", new Object[]{context, videoInfo, frameLayout, aVar});
            return;
        }
        frameLayout.removeAllViews();
        frameLayout.setVisibility(0);
        View inflate = LayoutInflater.from(context).inflate(R.layout.taolive_highlight_goods_layout, frameLayout);
        FrameLayout frameLayout2 = (FrameLayout) inflate.findViewById(R.id.taolive_highlight_product_switch_btn);
        TextView textView = (TextView) inflate.findViewById(R.id.taolive_highlight_product_switch_btn_text);
        AliUrlImageView aliUrlImageView = (AliUrlImageView) inflate.findViewById(R.id.taolive_highlight_product_switch_btn_img);
        if (videoInfo != null) {
            a(textView, videoInfo.curItemNum);
        }
        a(aliUrlImageView);
        frameLayout2.setOnClickListener(new View.OnClickListener() { // from class: tb.pfo.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else if (pfb.a(a.this).l() == null) {
                } else {
                    HashMap hashMap = new HashMap();
                    hashMap.put("glopenfrom", "timemoveclass_simple");
                    pfb.a(a.this).l().o(a.this, hashMap);
                }
            }
        });
        if (videoInfo != null && !"0".equals(videoInfo.roomStatus)) {
            frameLayout2.setVisibility(0);
        } else {
            frameLayout2.setVisibility(8);
        }
        if (videoInfo == null || !k.a((int) videoInfo.newRoomType)) {
            return;
        }
        frameLayout2.setVisibility(8);
    }

    public static void a(AliUrlImageView aliUrlImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6307a70a", new Object[]{aliUrlImageView});
        } else if (aliUrlImageView == null || !d.a()) {
        } else {
            aliUrlImageView.setSkipAutoSize(true);
            aliUrlImageView.setMaxLoopCount(1);
            aliUrlImageView.setImageDrawable(null);
            aliUrlImageView.setImageUrl(u.a("Highlight_showGoodsIcon", "https://gw.alicdn.com/imgextra/i1/O1CN01PaRaw023PdTOutzwg_!!6000000007248-2-tps-180-180.png"));
        }
    }

    private static void a(TextView textView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7b0fa7", new Object[]{textView, new Integer(i)});
        } else if (i == 0) {
            textView.setText(textView.getContext().getString(R.string.taolive_goodpackage_name));
        } else {
            textView.setText(String.valueOf(i));
        }
    }
}
