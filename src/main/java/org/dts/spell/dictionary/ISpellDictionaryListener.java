package org.dts.spell.dictionary;

/**
 * Stellt einen Listener dar, welcher auf das Hinzufügen von Wörtern zum Wörterbuch reagiert
 *
 * @author k.mifka, 23.08.2017
 */
public interface ISpellDictionaryListener
{
  /**
   * Ein Wort wurde zum Dictionary hinzugefügt
   *
   * @param pWord  Wort, das hinzugefügt wurde
   */
  void wordAdded(String pWord);
}
