package tt;

public interface ITTConnector {
	TTData getTT(Long ttId);
	Boolean saveTT(TTData tt);
}
