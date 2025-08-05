package com.taobao.android.detail.mainpic.holder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.taobao.R;
import tb.bny;

/* loaded from: classes4.dex */
public class l extends com.alibaba.android.ultron.vfw.viewholder.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String e = "mainpicMirrorImg";
    public com.taobao.android.detail.mainpic.g f;

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public void a(IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e66567ec", new Object[]{this, iDMComponent});
        }
    }

    public static com.alibaba.android.ultron.vfw.viewholder.e a(final com.taobao.android.detail.mainpic.g gVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.e) ipChange.ipc$dispatch("c4a647c3", new Object[]{gVar}) : new com.alibaba.android.ultron.vfw.viewholder.e() { // from class: com.taobao.android.detail.mainpic.holder.l.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alibaba.android.ultron.vfw.viewholder.e
            public com.alibaba.android.ultron.vfw.viewholder.b a(bny bnyVar) {
                IpChange ipChange2 = $ipChange;
                return ipChange2 instanceof IpChange ? (com.alibaba.android.ultron.vfw.viewholder.b) ipChange2.ipc$dispatch("ac1479f6", new Object[]{this, bnyVar}) : new l(bnyVar, com.taobao.android.detail.mainpic.g.this);
            }
        };
    }

    public l(bny bnyVar, com.taobao.android.detail.mainpic.g gVar) {
        super(bnyVar);
        this.f = gVar;
    }

    @Override // com.alibaba.android.ultron.vfw.viewholder.b
    public View a(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb64bd29", new Object[]{this, viewGroup});
        }
        ImageView imageView = new ImageView(viewGroup.getContext());
        imageView.setImageDrawable(viewGroup.getContext().getResources().getDrawable(R.drawable.main_pic_bottom_bg));
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, 160));
        return imageView;
    }
}
