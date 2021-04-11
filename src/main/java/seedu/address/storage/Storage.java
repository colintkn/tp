package seedu.address.storage;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import seedu.address.commons.exceptions.DataConversionException;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.ReadOnlyUserPrefs;
import seedu.address.model.UserPrefs;
import seedu.address.model.commandhistory.ReadOnlyCommandHistory;
import seedu.address.storage.commandhistory.CommandHistoryStorage;

/**
 * API of the Storage component
 */
public interface Storage extends AddressBookStorage, UserPrefsStorage, CommandHistoryStorage {

    @Override
    Path getAddressBookFilePath();

    @Override
    Optional<ReadOnlyAddressBook> readAddressBook() throws DataConversionException, IOException;

    @Override
    Optional<ReadOnlyAddressBook> readAddressBook(Path filePath) throws DataConversionException, IOException;

    @Override
    void saveAddressBook(ReadOnlyAddressBook addressBook) throws IOException;

    @Override
    void saveAddressBook(ReadOnlyAddressBook addressBook, Path filePath) throws IOException;

    @Override
    Path getUserPrefsFilePath();

    @Override
    Optional<UserPrefs> readUserPrefs() throws DataConversionException, IOException;

    @Override
    void saveUserPrefs(ReadOnlyUserPrefs userPrefs) throws IOException;

    @Override
    Path getCommandHistoryFilePath();

    @Override
    Optional<ReadOnlyCommandHistory> readCommandHistory() throws IOException;

    @Override
    void saveCommandHistory(ReadOnlyCommandHistory commandHistory) throws IOException;
}
