package tb;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.core.subservice.base.item.dxservice.impl.dinamic3.view.HImageView;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseItemModel;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class lqb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private LinearLayout f30814a;
    private FrameLayout[] b;
    private ProgressBar c;
    private lpy d = new lpy();

    static {
        kge.a(-768799383);
    }

    public static /* synthetic */ LinearLayout a(lqb lqbVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (LinearLayout) ipChange.ipc$dispatch("cac2d912", new Object[]{lqbVar}) : lqbVar.f30814a;
    }

    public static /* synthetic */ void a(lqb lqbVar, BaseSectionModel baseSectionModel, int i, View.OnClickListener onClickListener, JSONObject jSONObject, BaseSectionModel baseSectionModel2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72fbacff", new Object[]{lqbVar, baseSectionModel, new Integer(i), onClickListener, jSONObject, baseSectionModel2});
        } else {
            lqbVar.a(baseSectionModel, i, onClickListener, jSONObject, baseSectionModel2);
        }
    }

    public lqb(LinearLayout linearLayout, FrameLayout[] frameLayoutArr, ProgressBar progressBar) {
        this.f30814a = linearLayout;
        this.b = frameLayoutArr;
        this.c = progressBar;
    }

    public void a(BaseSectionModel<?> baseSectionModel, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, BaseSectionModel<?> baseSectionModel2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("390f2458", new Object[]{this, baseSectionModel, onClickListener, onClickListener2, baseSectionModel2});
            return;
        }
        BaseItemModel mo1097getItem = baseSectionModel.mo1097getItem();
        if (mo1097getItem == null) {
            return;
        }
        a(onClickListener2, mo1097getItem, this.b);
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (mo1097getItem.getJSONObject("" + i) == null) {
                break;
            }
            arrayList.add(a(mo1097getItem, "" + i));
            i++;
        }
        if (arrayList.isEmpty()) {
            this.f30814a.setVisibility(8);
            return;
        }
        a(arrayList, this.b, baseSectionModel, onClickListener, baseSectionModel2);
        this.d.a(baseSectionModel);
    }

    private void a(final View.OnClickListener onClickListener, JSONObject jSONObject, final FrameLayout[] frameLayoutArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("439876b9", new Object[]{this, onClickListener, jSONObject, frameLayoutArr});
        } else if (jSONObject.getJSONObject(noa.VALUE_SHOWTYPE_SIMILAR) == null) {
            this.f30814a.setVisibility(8);
        } else {
            this.f30814a.setVisibility(0);
            this.f30814a.setOnClickListener(new View.OnClickListener() { // from class: tb.lqb.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                        return;
                    }
                    View.OnClickListener onClickListener2 = onClickListener;
                    if (onClickListener2 == null) {
                        return;
                    }
                    onClickListener2.onClick(view);
                    for (FrameLayout frameLayout : frameLayoutArr) {
                        frameLayout.setVisibility(8);
                    }
                    lqb.a(lqb.this).setVisibility(8);
                }
            });
        }
    }

    private void a(List<JSONObject> list, FrameLayout[] frameLayoutArr, final BaseSectionModel<?> baseSectionModel, final View.OnClickListener onClickListener, final BaseSectionModel<?> baseSectionModel2) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7f9b37a", new Object[]{this, list, frameLayoutArr, baseSectionModel, onClickListener, baseSectionModel2});
            return;
        }
        int size = list.size();
        while (i < frameLayoutArr.length) {
            JSONObject jSONObject = null;
            if (i < size) {
                jSONObject = list.get(i);
            }
            final JSONObject jSONObject2 = jSONObject;
            JSONObject a2 = a(jSONObject2, "content");
            if (jSONObject2 == null || a2 == null) {
                return;
            }
            String string = a2.getString("title");
            String string2 = a2.getString("pic");
            FrameLayout frameLayout = frameLayoutArr[i];
            a(frameLayout, string, string2);
            final int i2 = i + 1;
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: tb.lqb.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    } else {
                        lqb.a(lqb.this, baseSectionModel, i2, onClickListener, jSONObject2, baseSectionModel2);
                    }
                }
            });
            i = i2;
        }
    }

    private void a(FrameLayout frameLayout, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e0bf7f", new Object[]{this, frameLayout, str, str2});
            return;
        }
        frameLayout.setVisibility(0);
        if (!(frameLayout.getChildAt(0) instanceof LinearLayout)) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) frameLayout.getChildAt(0);
        if (linearLayout.getChildAt(1) instanceof TextView) {
            ((TextView) linearLayout.getChildAt(1)).setText(str);
        }
        if (!(linearLayout.getChildAt(0) instanceof HImageView)) {
            return;
        }
        ((HImageView) linearLayout.getChildAt(0)).setImageUrl(str2);
    }

    private void a(BaseSectionModel<?> baseSectionModel, int i, View.OnClickListener onClickListener, JSONObject jSONObject, BaseSectionModel<?> baseSectionModel2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("261967f2", new Object[]{this, baseSectionModel, new Integer(i), onClickListener, jSONObject, baseSectionModel2});
            return;
        }
        this.d.a(baseSectionModel, jSONObject);
        FrameLayout[] frameLayoutArr = this.b;
        View[] viewArr = {this.f30814a, frameLayoutArr[0], frameLayoutArr[1], frameLayoutArr[2]};
        for (View view : viewArr) {
            view.setClickable(false);
            view.setVisibility(8);
        }
        onClickListener.onClick(viewArr[i]);
        liw.a(null, baseSectionModel2, jSONObject);
        this.c.setVisibility(0);
    }

    private JSONObject a(JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a5543672", new Object[]{this, jSONObject, str});
        }
        if (jSONObject != null) {
            return jSONObject.getJSONObject(str);
        }
        return null;
    }
}
