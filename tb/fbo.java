package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.core.detail.kit.utils.f;
import com.taobao.android.detail.core.detail.kit.view.holder.c;
import com.taobao.android.detail.core.detail.kit.view.widget.base.RoundCornerImageView;
import com.taobao.android.detail.datasdk.protocol.image.DetailImageView;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class fbo extends c<fbz> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ViewGroup g;
    private RelativeLayout h;
    private TextView i;

    static {
        kge.a(495952493);
    }

    public static /* synthetic */ Object ipc$super(fbo fboVar, String str, Object... objArr) {
        if (str.hashCode() == 90991720) {
            super.a();
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public fbo(Context context) {
        super(context);
        emu.a("com.taobao.android.detail.wrapper.ext.component.main.viewholder.AvatarGroupsViewHolder");
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public View a(Context context, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f1543f21", new Object[]{this, context, viewGroup});
        }
        this.g = (ViewGroup) View.inflate(context, R.layout.x_detail_avatar_groups, null);
        this.h = (RelativeLayout) this.g.findViewById(R.id.detail_avatar_groups_content);
        this.i = (TextView) this.g.findViewById(R.id.detail_avatar_groups_title);
        return this.g;
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a(fbz fbzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e840b2da", new Object[]{this, fbzVar});
        } else if (fbzVar != null) {
            this.h.removeAllViews();
            if (fbzVar.d > 0) {
                int i = -epo.b(8);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                for (int i2 = fbzVar.d - 1; i2 >= 0; i2--) {
                    int i3 = i2 + 10;
                    View a2 = a(fbzVar.a(i2), fbzVar.b(i2));
                    a2.setId(i3);
                    if (i2 != 0) {
                        layoutParams.addRule(1, i3 - 1);
                        layoutParams.setMargins(i, 0, 0, 0);
                    } else {
                        layoutParams.addRule(1, 0);
                        layoutParams.setMargins(0, 0, 0, 0);
                    }
                    this.h.addView(a2, layoutParams);
                }
                this.i.setPadding(0, epo.g, 0, 0);
            } else {
                this.i.setPadding(0, 0, 0, 0);
            }
            if (!TextUtils.isEmpty(fbzVar.f27774a)) {
                this.i.setText(fbzVar.f27774a);
                this.i.setVisibility(0);
                return;
            }
            this.i.setVisibility(8);
        }
    }

    private View a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b8543ebe", new Object[]{this, str, str2});
        }
        RelativeLayout relativeLayout = new RelativeLayout(this.f9568a);
        RoundCornerImageView roundCornerImageView = new RoundCornerImageView(this.f9568a);
        epj.b();
        roundCornerImageView.setId(101);
        a(str, null, roundCornerImageView);
        int b = epo.b(40);
        relativeLayout.addView(roundCornerImageView, new RelativeLayout.LayoutParams(b, b));
        DetailImageView detailImageView = new DetailImageView(this.f9568a);
        a(str2, null, detailImageView);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, epo.b(14));
        layoutParams.addRule(3, 101);
        layoutParams.addRule(14);
        layoutParams.setMargins(0, -epo.b(7), 0, 0);
        relativeLayout.addView(detailImageView, layoutParams);
        return relativeLayout;
    }

    public void a(String str, epm epmVar, DetailImageView detailImageView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4447901", new Object[]{this, str, epmVar, detailImageView});
        } else {
            f.a(this.f9568a).a(detailImageView, str, epmVar);
        }
    }

    @Override // com.taobao.android.detail.core.detail.kit.view.holder.c
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        super.a();
        c();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        ViewGroup viewGroup = this.g;
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeAllViews();
        this.g = null;
    }
}
