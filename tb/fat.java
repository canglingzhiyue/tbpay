package tb;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.view.holder.desc.b;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.taobao.R;
import tb.epl;

/* loaded from: classes5.dex */
public class fat extends b<fbi> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private RelativeLayout k;
    private TextView l;
    private TextView m;
    private DetailImageView n;
    private DetailImageView o;
    private DetailImageView p;
    private TextView q;
    private TextView r;

    static {
        kge.a(2092614351);
        kge.a(-1201612728);
    }

    public static /* synthetic */ Object ipc$super(fat fatVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    /* renamed from: c  reason: avoid collision after fix types in other method */
    public boolean c2(fbi fbiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c53f0591", new Object[]{this, fbiVar})).booleanValue();
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b, com.taobao.android.detail.core.detail.kit.view.holder.c
    public /* synthetic */ void a(com.taobao.android.detail.datasdk.model.viewmodel.main.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64aa4550", new Object[]{this, bVar});
        } else {
            b((fbi) bVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ boolean a(fbi fbiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e7480be1", new Object[]{this, fbiVar})).booleanValue() : c2(fbiVar);
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public /* synthetic */ View c(fbi fbiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("55e1d761", new Object[]{this, fbiVar}) : a2(fbiVar);
    }

    public fat(Activity activity) {
        super(activity);
        this.k = (RelativeLayout) View.inflate(activity, R.layout.x_detail_desc_user_talk, null);
        this.l = (TextView) this.k.findViewById(R.id.tv_title);
        this.m = (TextView) this.k.findViewById(R.id.tv_author);
        this.n = (DetailImageView) this.k.findViewById(R.id.iv_thumbnails);
        this.o = (DetailImageView) this.k.findViewById(R.id.iv_tag);
        this.p = (DetailImageView) this.k.findViewById(R.id.iv_author_avatar);
        this.q = (TextView) this.k.findViewById(R.id.tv_update_time);
        this.r = (TextView) this.k.findViewById(R.id.tv_like_count);
        emu.a("com.taobao.android.detail.wrapper.ext.component.desc.viewholder.UserTalkViewHolder");
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    public View a2(fbi fbiVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("aceca40d", new Object[]{this, fbiVar}) : this.k;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.desc.b
    public void b(fbi fbiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6bbff0c", new Object[]{this, fbiVar});
            return;
        }
        this.l.setText(fbiVar.b);
        this.m.setText(fbiVar.c);
        this.q.setText(fbiVar.f);
        this.r.setText(TextUtils.isEmpty(fbiVar.g) ? "0" : fbiVar.g);
        if (TextUtils.isEmpty(fbiVar.e)) {
            this.o.setVisibility(8);
        } else {
            this.o.setVisibility(0);
            a(this.o, fbiVar.e, new epm(this.o.getLayoutParams().width, this.o.getLayoutParams().height), null, null);
        }
        e(fbiVar);
        d(fbiVar);
    }

    private void d(fbi fbiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3c20c0e", new Object[]{this, fbiVar});
        } else if (TextUtils.isEmpty(fbiVar.d)) {
            this.p.setBackgroundResource(R.drawable.detail_avatar);
        } else {
            a(this.p, fbiVar.d, new epm(this.p.getLayoutParams().width, this.p.getLayoutParams().height), null, new epl.a().b(R.drawable.detail_avatar).a(R.drawable.detail_avatar).a());
        }
    }

    private void e(fbi fbiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a245128f", new Object[]{this, fbiVar});
            return;
        }
        a(this.n, fbiVar.f27746a, new epm(this.n.getLayoutParams().width, this.n.getLayoutParams().height), null, new epl.a().b(R.drawable.detail_img_load_fail).b(ImageView.ScaleType.CENTER_INSIDE).a(R.drawable.detail_img_load_fail).a(ImageView.ScaleType.CENTER_INSIDE).c(ImageView.ScaleType.CENTER_CROP).a());
    }
}
