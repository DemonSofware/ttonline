package tt;

public interface ITTConnector {
	TTData getTT(String ttId);
	Boolean saveTT(TTData tt);
}
