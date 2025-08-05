package tb;

import android.content.Context;
import com.nirvana.tools.logger.model.b;
import java.util.List;

/* loaded from: classes4.dex */
public class czy extends czw<b, daa> {
    public czy(Context context, dah dahVar, String str, String str2) {
        super(new daa(context, str, str2), dahVar);
    }

    public List<b> a(int i) {
        return ((daa) this.f26628a).a(i, 0, "urgency DESC");
    }
}
