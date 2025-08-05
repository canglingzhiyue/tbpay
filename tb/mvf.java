package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.global.setting.d;
import com.taobao.mytaobao.newSettingV2.data.NewGeneralSettingDataModel;
import com.taobao.mytaobao.ut.c;
import com.taobao.statistic.TBS;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class mvf extends RecyclerView.ViewHolder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f31278a;
    public TextView b;
    public View c;
    public TextView d;
    public TextView e;
    public Switch f;
    public LinearLayout g;
    public TextView h;
    public View i;
    private mvg l;
    public View m;
    public mtr<NewGeneralSettingDataModel> n;

    static {
        kge.a(-728031337);
    }

    public static /* synthetic */ Object ipc$super(mvf mvfVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public static /* synthetic */ mvg a(mvf mvfVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mvg) ipChange.ipc$dispatch("67d7102d", new Object[]{mvfVar}) : mvfVar.l;
    }

    public static /* synthetic */ void a(mvf mvfVar, NewGeneralSettingDataModel newGeneralSettingDataModel, String str, JSONArray jSONArray, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8283834c", new Object[]{mvfVar, newGeneralSettingDataModel, str, jSONArray, bool});
        } else {
            mvfVar.a(newGeneralSettingDataModel, str, jSONArray, bool);
        }
    }

    public mvf(Context context, View view) {
        super(view);
        this.f31278a = view.findViewById(R.id.mytaobao_divider_no_title);
        this.b = (TextView) view.findViewById(R.id.mytaobao_divider_with_title);
        this.c = view.findViewById(R.id.mytaobao_divider_line);
        this.d = (TextView) view.findViewById(R.id.mytaobao_setting_title);
        this.e = (TextView) view.findViewById(R.id.mytaobao_setting_desc);
        this.f = (Switch) view.findViewById(R.id.mytaobao_setting_switch);
        this.g = (LinearLayout) view.findViewById(R.id.mytaobao_setting_right_content);
        this.h = (TextView) view.findViewById(R.id.mytaobao_setting_right_tips);
        this.m = view.findViewById(R.id.viewArrowRight);
        this.i = view.findViewById(R.id.mytaobao_setting_item);
    }

    public void a(final NewGeneralSettingDataModel newGeneralSettingDataModel) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d66eec7c", new Object[]{this, newGeneralSettingDataModel});
            return;
        }
        final String str = newGeneralSettingDataModel.nativeKey;
        final JSONObject jSONObject = newGeneralSettingDataModel.events;
        if (jSONObject == null || (view = this.i) == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: tb.mvf.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                mvf.a(mvf.this, newGeneralSettingDataModel, str, jSONObject.getJSONArray("itemClick"), null);
                if (mvf.this.n == null) {
                    return;
                }
                mvf.this.n.onResult(true, null, newGeneralSettingDataModel);
            }
        });
        this.f.setOnClickListener(new View.OnClickListener() { // from class: tb.mvf.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("8dfcefe2", new Object[]{this, view2});
                    return;
                }
                JSONArray jSONArray = jSONObject.getJSONArray("switchChange");
                boolean isChecked = mvf.this.f.isChecked();
                if (d.a().b() && mxr.KEY_INLINE_VOLUME.equals(str)) {
                    isChecked = !isChecked;
                }
                mxr.a(str, Boolean.valueOf(isChecked));
                newGeneralSettingDataModel.switchState = mvf.this.f.isChecked();
                if (mvf.a(mvf.this) != null) {
                    mvf.a(mvf.this).a(newGeneralSettingDataModel, str, mvf.this.f.isChecked());
                }
                mvf mvfVar = mvf.this;
                mvf.a(mvfVar, newGeneralSettingDataModel, str, jSONArray, Boolean.valueOf(mvfVar.f.isChecked()));
            }
        });
    }

    private void a(NewGeneralSettingDataModel newGeneralSettingDataModel, String str, JSONArray jSONArray, Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9943c1f", new Object[]{this, newGeneralSettingDataModel, str, jSONArray, bool});
        } else if (jSONArray == null) {
        } else {
            Iterator<Object> it = jSONArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) next;
                    String string = jSONObject.getString("type");
                    JSONObject jSONObject2 = jSONObject.getJSONObject("field");
                    if ("openUrl".equals(string)) {
                        b(jSONObject2);
                    } else if ("userTrack".equals(string)) {
                        a(jSONObject2, bool);
                    }
                }
            }
        }
    }

    public void a(mvg mvgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f543d23a", new Object[]{this, mvgVar});
        } else {
            this.l = mvgVar;
        }
    }

    private void a(JSONObject jSONObject, Boolean bool) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f222d6c5", new Object[]{this, jSONObject, bool});
        } else if (jSONObject == null) {
        } else {
            String string = jSONObject.getString("arg1");
            String string2 = jSONObject.getString("page");
            try {
                i = Integer.parseInt(jSONObject.getString("eventId"));
            } catch (Exception unused) {
                i = 0;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("args");
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            if (bool != null) {
                jSONObject2.put("isOpen", (Object) (bool.booleanValue() ? "1" : "0"));
            }
            TBS.Ext.commitEvent(string2, i, string, null, null, c.a(jSONObject2));
        }
    }

    private void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63b99827", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
        } else {
            Nav.from(Globals.getApplication()).toUri(jSONObject.getString("url"));
        }
    }
}
