package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.f;
import com.alibaba.android.aura.s;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.android.aura.service.event.c;
import com.alibaba.android.aura.service.event.d;
import com.alibaba.android.umf.datamodel.service.rule.UMFRuleIO;
import com.alibaba.android.umf.node.service.data.rule.RuleType;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class ekd extends ejx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Context c;
    public s d;
    public List e;
    public RecyclerView f;
    public View g;
    private String h;
    private int i;
    private int j;

    static {
        kge.a(-785301886);
    }

    public static /* synthetic */ Object ipc$super(ekd ekdVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public ekd(Context context, s sVar, List list, RecyclerView recyclerView, View view) {
        this.c = context;
        this.d = sVar;
        this.e = list;
        this.f = recyclerView;
        this.g = view;
        emu.a("com.taobao.android.detail.core.standard.mainpic.expand.PicGalleryExpandEntranceImpl");
    }

    @Override // tb.ejx
    public void c(AURAEventIO aURAEventIO, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b274e26a", new Object[]{this, aURAEventIO, fVar});
        } else if (aURAEventIO == null || this.f == null || aURAEventIO.getEventModel().d() == null) {
            arc.a().b("processExpandPicGallery:auraEventIO/mRecyclerView/getRenderComponent is null");
        } else {
            AURARenderComponent d = aURAEventIO.getEventModel().d();
            int width = this.f.getWidth();
            int height = this.f.getHeight();
            int i = (int) (width / 0.6f);
            if (height == i) {
                return;
            }
            emj.b(this.f, i);
            a(d, width, height);
            a(d, "9:15");
            this.f.getAdapter().notifyDataSetChanged();
            View a2 = a(d);
            ejh.a(this.f, a2, width, i);
            if (fVar != null) {
                for (ejz ejzVar : fVar.b(ejz.class)) {
                    if (ejzVar != null) {
                        ejzVar.a(this.f, a2, width, i);
                    }
                }
            }
            this.f27353a = true;
        }
    }

    @Override // tb.ejx
    public void d(AURAEventIO aURAEventIO, f fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6a614feb", new Object[]{this, aURAEventIO, fVar});
        } else if (aURAEventIO == null || this.f == null || aURAEventIO.getEventModel().d() == null) {
            arc.a().b("processExitExpandPicGallery:auraEventIO/mRecyclerView/getRenderComponent is null");
        } else {
            AURARenderComponent d = aURAEventIO.getEventModel().d();
            emj.b(this.f, this.j);
            a(d, this.h);
            this.f.getAdapter().notifyDataSetChanged();
            View a2 = a(d);
            ejh.b(this.f, a2, this.i, this.j);
            if (fVar != null) {
                for (ejy ejyVar : fVar.b(ejy.class)) {
                    if (ejyVar != null) {
                        ejyVar.a(this.f, a2, this.i, this.j);
                    }
                }
            }
            this.f27353a = false;
        }
    }

    @Override // tb.ejx
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    @Override // tb.ejx
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
            return;
        }
        View view = this.g;
        if (view == null) {
            return;
        }
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
    }

    @Override // tb.ejx
    public void a(final AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2d42ad4", new Object[]{this, aURAEventIO});
        } else if (this.c == null || this.d == null || aURAEventIO == null || aURAEventIO.getEventModel().d() == null) {
            arc.a().b("addPicGalleryExitExpandButton:mContext/mAURAInstance/auraEventIO/getRenderComponent is null");
        } else {
            View a2 = a(aURAEventIO.getEventModel().d());
            if (!(a2 instanceof FrameLayout)) {
                return;
            }
            Button button = new Button(this.c);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(bay.a(54.0f), bay.a(32.0f));
            layoutParams.topMargin = ecr.a() + bay.a(8.0f);
            layoutParams.leftMargin = bay.a(48.0f);
            button.setLayoutParams(layoutParams);
            button.setText("退出");
            button.setTextSize(1, 11.0f);
            button.setTextColor(-1);
            button.setGravity(17);
            button.setBackgroundResource(R.drawable.pic_gallery_exit_expand_btn_bg);
            button.setTag(ekb.EVENT_TYPE);
            button.setOnClickListener(new View.OnClickListener() { // from class: tb.ekd.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        c.a(ekd.this.d, ekb.EVENT_TYPE, new d(aURAEventIO.getEventModel()));
                    }
                }
            });
            ((FrameLayout) a2).addView(button);
        }
    }

    @Override // tb.ejx
    public void b(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186833d5", new Object[]{this, aURAEventIO});
        } else if (aURAEventIO == null || aURAEventIO.getEventModel().d() == null) {
            arc.a().b("removePicGalleryExitExpandButton:auraEventIO/getRenderComponent is null");
        } else {
            View a2 = a(aURAEventIO.getEventModel().d());
            if (!(a2 instanceof ViewGroup)) {
                return;
            }
            ViewGroup viewGroup = (ViewGroup) a2;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if ((childAt.getTag() instanceof String) && TextUtils.equals((CharSequence) childAt.getTag(), ekb.EVENT_TYPE)) {
                    viewGroup.removeView(childAt);
                    return;
                }
            }
        }
    }

    private void a(AURARenderComponent aURARenderComponent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2753db73", new Object[]{this, aURARenderComponent, new Integer(i), new Integer(i2)});
            return;
        }
        this.i = i;
        this.j = i2;
        if (aURARenderComponent == null || aURARenderComponent.parent == null || aURARenderComponent.parent.data == null || aURARenderComponent.parent.data.fields == null) {
            arc.a().b("savePicGalleryOriginSize:component is invalid");
            return;
        }
        Object obj = aURARenderComponent.parent.data.fields.get("dimension");
        if (!(obj instanceof String)) {
            return;
        }
        this.h = (String) obj;
    }

    private void a(AURARenderComponent aURARenderComponent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a501edd", new Object[]{this, aURARenderComponent, str});
        } else if (this.d == null || aURARenderComponent == null || aURARenderComponent.parent == null || TextUtils.isEmpty(str)) {
            arc.a().b("adjustRulesForPicGallerySize:component is invalid");
        } else {
            AURARenderComponent aURARenderComponent2 = aURARenderComponent.parent;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("dimension", (Object) str);
            this.d.a("aura.workflow.adjustRules", new UMFRuleIO(Arrays.asList(bbg.a(RuleType.PROPS_WRITE_BACK, aURARenderComponent2, jSONObject))), null);
        }
    }

    private View a(AURARenderComponent aURARenderComponent) {
        List list;
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("40098d55", new Object[]{this, aURARenderComponent});
        }
        if (aURARenderComponent == null || (list = this.e) == null || list.isEmpty() || (recyclerView = this.f) == null || recyclerView.getLayoutManager() == null) {
            arc.a().b("getCurrentView:component is invalid");
            return null;
        }
        int i2 = -1;
        while (true) {
            if (i >= this.e.size()) {
                break;
            }
            Object obj = this.e.get(i);
            if ((obj instanceof AURARenderComponent) && TextUtils.equals(((AURARenderComponent) obj).key, aURARenderComponent.key)) {
                i2 = i;
                break;
            }
            i++;
        }
        return this.f.getLayoutManager().findViewByPosition(i2);
    }
}
