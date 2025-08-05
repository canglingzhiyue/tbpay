package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.q;
import kotlin.t;
import tb.ruw;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "f", "Ljava/io/File;", "e", "Ljava/io/IOException;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
final class FilesKt__UtilsKt$copyRecursively$2 extends Lambda implements ruw<File, IOException, t> {
    final /* synthetic */ ruw<File, IOException, OnErrorAction> $onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FilesKt__UtilsKt$copyRecursively$2(ruw<? super File, ? super IOException, ? extends OnErrorAction> ruwVar) {
        super(2);
        this.$onError = ruwVar;
    }

    @Override // tb.ruw
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ t mo2423invoke(File file, IOException iOException) {
        invoke2(file, iOException);
        return t.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(File f, IOException e) {
        q.d(f, "f");
        q.d(e, "e");
        if (this.$onError.mo2423invoke(f, e) != OnErrorAction.TERMINATE) {
            return;
        }
        throw new TerminateException(f);
    }
}
