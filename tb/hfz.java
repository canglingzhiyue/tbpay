package tb;

import mtopsdk.common.util.StringUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chat.view.ChatRecyclerView2;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.room.utils.d;
import com.taobao.taolive.sdk.utils.b;

/* loaded from: classes5.dex */
public abstract class hfz extends hfy {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public TextView f28605a;
    public TextView f;
    public TextView g;
    private ViewGroup h;
    public boolean j;

    static {
        kge.a(1167784912);
    }

    public hfz(View view, ViewGroup viewGroup, a aVar) {
        super(view, aVar);
        this.j = false;
        this.h = viewGroup;
        b();
    }

    private void b() {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        ATaoLiveOpenEntity o = this.e.o();
        if (o == null || o.abilityCompontent == null || !o.abilityCompontent.b(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_LRCommentFeatMap)) {
            return;
        }
        Object a2 = o.abilityCompontent.a(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_LRCommentFeatMap);
        if (!(a2 instanceof String) || (parseObject = JSON.parseObject((String) a2)) == null || !parseObject.containsKey("disableCommentButton")) {
            return;
        }
        this.j = parseObject.getBoolean("disableCommentButton").booleanValue();
    }

    public void a() {
        int makeMeasureSpec;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.itemView instanceof ViewGroup) {
            int measuredWidth = ((((this.h.getMeasuredWidth() - this.h.getPaddingLeft()) - this.h.getPaddingRight()) - this.itemView.getPaddingLeft()) - this.itemView.getPaddingRight()) - b.a(this.itemView.getContext(), ChatRecyclerView2.recycleViewItemCornerIconPaddingWidthDP);
            int a2 = d.a(this.d, 50.0f);
            int i = measuredWidth;
            for (int i2 = 0; i2 < ((ViewGroup) this.itemView).getChildCount(); i2++) {
                View childAt = ((ViewGroup) this.itemView).getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(a2, Integer.MIN_VALUE);
                    if (childAt.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                        if (childAt.getLayoutParams().width > 0) {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().width, 1073741824);
                        } else {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((measuredWidth - ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).leftMargin) - ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).rightMargin, Integer.MIN_VALUE);
                        }
                    } else {
                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE);
                    }
                    childAt.measure(makeMeasureSpec, makeMeasureSpec2);
                    if (childAt != this.f28605a) {
                        i -= childAt.getMeasuredWidth();
                        if (childAt.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                            i -= ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).leftMargin + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).rightMargin;
                        }
                    }
                }
            }
            if (this.f28605a.getMeasuredWidth() <= i || i <= d.a(this.d, 20.0f)) {
                return;
            }
            TextView textView = this.f28605a;
            textView.setText(StringUtils.ellipsize(textView.getText(), this.f28605a.getPaint(), i, StringUtils.TruncateAt.END));
        }
    }
}
