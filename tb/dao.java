package tb;

import com.nirvana.tools.logger.model.c;
import java.util.List;

/* loaded from: classes4.dex */
public interface dao<T extends c> {
    boolean upload(List<T> list);
}
