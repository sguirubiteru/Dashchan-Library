package chan.http;

import java.io.IOException;
import java.io.OutputStream;

/**
 * <p>HTTP request entity. Used to pass data with HTTP POST request.</p>
 */
public interface RequestEntity {
	/**
	 * <p>Add string field to entity with given {@code name} and {@code value}.</p>
	 *
	 * @param name Field name.
	 * @param value Field value.
	 */
	public abstract void add(String name, String value);

	/**
	 * <p>Returns a content type of entity.</p>
	 *
	 * @return Content type.
	 */
	public abstract String getContentType();

	/**
	 * <p>Returns a content length of entity.</p>
	 *
	 * @return Content length.
	 */
	public abstract long getContentLength();

	/**
	 * <p>Writes entity to given {@code output}.</p>
	 *
	 * @param output Output stream.
	 * @throws IOException if an error occurs while writing to given {@code output}.
	 */
	public abstract void write(OutputStream output) throws IOException;

	/**
	 * <p>Returns a deep copy of this {@code RequestEntity} instance.</p>
	 *
	 * @return Copy of this entity.
	 */
	public abstract RequestEntity copy();
}