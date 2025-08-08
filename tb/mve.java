package tb;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import mtopsdk.common.util.StringUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.global.setting.c;
import com.taobao.mytaobao.newSettingV2.data.NewGeneralSettingDataModel;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.util.List;

/* loaded from: classes7.dex */
public class mve extends RecyclerView.Adapter<mvf> implements mvg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final LayoutInflater f31277a;
    private List<NewGeneralSettingDataModel> b;
    private mvg c;
    private final Context d;
    public mtr<NewGeneralSettingDataModel> e;

    static {
        kge.a(-665615831);
        kge.a(-205678076);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public /* synthetic */ void onBindViewHolder(mvf mvfVar, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1071b8aa", new Object[]{this, mvfVar, new Integer(i)});
        } else {
            a(mvfVar, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [tb.mvf, android.support.v7.widget.RecyclerView$ViewHolder] */
    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: onCreateViewHolder */
    public /* synthetic */ mvf mo1596onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (RecyclerView.ViewHolder) ipChange.ipc$dispatch("12368d2e", new Object[]{this, viewGroup, new Integer(i)}) : a(viewGroup, i);
    }

    public mve(Context context) {
        this.f31277a = LayoutInflater.from(context);
        this.d = context;
    }

    public void a(List<NewGeneralSettingDataModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7052959", new Object[]{this, list});
        } else {
            this.b = list;
        }
    }

    public int a(NewGeneralSettingDataModel newGeneralSettingDataModel) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d66eec6f", new Object[]{this, newGeneralSettingDataModel})).intValue() : this.b.indexOf(newGeneralSettingDataModel);
    }

    public mvf a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (mvf) ipChange.ipc$dispatch("56b4278d", new Object[]{this, viewGroup, new Integer(i)}) : new mvf(this.d, this.f31277a.inflate(R.layout.mytaobao_setting_general_item, viewGroup, false));
    }

    public void a(mvf mvfVar, int i) {
        Object valueOf;
        Object valueOf2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b328d088", new Object[]{this, mvfVar, new Integer(i)});
            return;
        }
        NewGeneralSettingDataModel newGeneralSettingDataModel = this.b.get(i);
        if (newGeneralSettingDataModel.isShowDividerWithoutTitle) {
            mvfVar.c.setVisibility(8);
            mvfVar.f31278a.setVisibility(0);
        } else if (!StringUtils.isEmpty(newGeneralSettingDataModel.showDividerWithTitle)) {
            mvfVar.c.setVisibility(8);
            mvfVar.b.setVisibility(0);
            mvfVar.b.setText(newGeneralSettingDataModel.showDividerWithTitle);
        } else {
            mvfVar.c.setVisibility(0);
            mvfVar.f31278a.setVisibility(8);
            mvfVar.b.setVisibility(8);
        }
        mvfVar.d.setText(newGeneralSettingDataModel.title);
        if (!StringUtils.isEmpty(newGeneralSettingDataModel.desc)) {
            mvfVar.e.setVisibility(0);
            mvfVar.e.setText(newGeneralSettingDataModel.desc);
        }
        if ("switch".equalsIgnoreCase(newGeneralSettingDataModel.style)) {
            mvfVar.f.setVisibility(0);
            mvfVar.f.setChecked(newGeneralSettingDataModel.switchState);
            mvfVar.g.setVisibility(8);
        } else if (NewGeneralSettingDataModel.STYLE_PICKER_SWITCH.equalsIgnoreCase(newGeneralSettingDataModel.style)) {
            mvfVar.f.setVisibility(0);
            mvfVar.f.setChecked(newGeneralSettingDataModel.switchState);
            if (newGeneralSettingDataModel.switchState) {
                mvfVar.g.setVisibility(0);
                mvfVar.m.setVisibility(8);
                try {
                    JSONObject parseObject = JSONObject.parseObject((String) c.a(Globals.getApplication(), "mytaobao").b().a("mytaobao", newGeneralSettingDataModel.nativeKey + "Sub", "", null));
                    int intValue = parseObject.getInteger("startHour").intValue();
                    int intValue2 = parseObject.getInteger("starMinute").intValue();
                    int intValue3 = parseObject.getInteger("endHour").intValue();
                    int intValue4 = parseObject.getInteger("endMinute").intValue();
                    StringBuilder sb = new StringBuilder();
                    sb.append(intValue);
                    sb.append(":");
                    if (intValue2 < 10) {
                        valueOf = "0" + intValue2;
                    } else {
                        valueOf = Integer.valueOf(intValue2);
                    }
                    sb.append(valueOf);
                    sb.append("-");
                    sb.append(intValue3);
                    sb.append(":");
                    if (intValue4 < 10) {
                        valueOf2 = "0" + intValue4;
                    } else {
                        valueOf2 = Integer.valueOf(intValue4);
                    }
                    sb.append(valueOf2);
                    mvfVar.h.setText(sb.toString());
                } catch (Throwable unused) {
                    mvfVar.h.setText("0:00-0:00");
                }
            } else {
                mvfVar.g.setVisibility(8);
            }
        } else {
            mvfVar.f.setVisibility(8);
            mvfVar.g.setVisibility(0);
            mvfVar.m.setVisibility(0);
            mvfVar.h.setText(newGeneralSettingDataModel.rightTip);
        }
        mvfVar.a(newGeneralSettingDataModel);
        mvfVar.a(this);
        mvfVar.n = this.e;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<NewGeneralSettingDataModel> list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public void a(mvg mvgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f543d23a", new Object[]{this, mvgVar});
        } else {
            this.c = mvgVar;
        }
    }

    @Override // tb.mvg
    public void a(NewGeneralSettingDataModel newGeneralSettingDataModel, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b62c4e", new Object[]{this, newGeneralSettingDataModel, str, new Boolean(z)});
            return;
        }
        mvg mvgVar = this.c;
        if (mvgVar == null) {
            return;
        }
        mvgVar.a(newGeneralSettingDataModel, str, z);
    }
}
