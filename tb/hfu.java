package tb;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.a;
import com.taobao.taobao.R;

/* loaded from: classes5.dex */
public class hfu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1567927738);
    }

    public static hfy a(hfw hfwVar, ViewGroup viewGroup, int i, a aVar) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hfy) ipChange.ipc$dispatch("b81e484b", new Object[]{hfwVar, viewGroup, new Integer(i), aVar}) : i == hfv.NEW_FOLLOW ? new hgc(viewGroup, hfwVar, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_msg_item_follow_new2_flexalocal, viewGroup, false), aVar) : i == hfv.OLD_FOLLOW ? new hgd(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_msg_item_follow_old2_flexalocal, viewGroup, false), aVar) : i == hfv.SHARE ? new hgf(viewGroup, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_msg_item_share2_flexalocal, viewGroup, false), aVar) : i == hfv.ADD_ONE ? new hfx(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_msg_item_text_addone_flexalocal, viewGroup, false), aVar) : i == hfv.GENERAL_ACTION ? new hgb(viewGroup, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_msg_item_general_action_flexalocal, viewGroup, false), aVar) : i == hfv.QUESTION_ANSWER ? new hge(viewGroup, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_msg_item_question_answer_flexalocal, viewGroup, false), aVar) : i == hfv.DYNAMIC_COMMON ? new hga(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_msg_item_dynamic_common_layout_flexalocal, viewGroup, false), aVar) : new hgg(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.taolive_msg_item_text2_flexalocal, viewGroup, false), aVar);
    }
}
